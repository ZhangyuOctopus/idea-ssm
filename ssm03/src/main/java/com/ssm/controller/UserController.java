package com.ssm.controller;
import com.ssm.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping("testException")
    public String testException() throws SysException{
        System.out.println("执行了");
        /*模拟异常: 异常往上抛*/
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            /*打印异常信息*/
            e.printStackTrace();
            /*向上抛出自定义异常, 在这个类中使用了一个构造方法来存储错误信息*/
            throw new SysException("查询用户出现了异常");
        }
        return "success";
    }
}