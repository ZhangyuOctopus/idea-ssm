package com.ssm.controller;
import com.ssm.entity.Account;
import com.ssm.entity.AccountList;
import com.ssm.entity.UserDate;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/*请求参数绑定*/
@Controller
/*一级路径*/
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(value = "testparam")
    public String testParam(String username){
        System.out.println("username = " + username);
        return  "success";
    }

    /*请求参数绑定将数据封装到JavaBean中*/
    @RequestMapping(value = "saveAccount")
    public String testParam(Account account) {
        System.out.println("username = " + account.getUsername());
        System.out.println("password = " + account.getPassword());
        System.out.println("money = " + account.getMoney());
        System.out.println("money = " + account.getUser().getName());
        System.out.println("money = " + account.getUser().getAge());
        return "success";
    }

    /*请求参数绑定将数据封装到JavaBean中(JavaBean中存在集合属性)*/
    @RequestMapping(value = "saveAccountList")
    public String testParam(AccountList accountList) {
        System.out.println(accountList);
        return "success";
    }

    /*自定义类型转换转换器*/
    @RequestMapping(value = "userDate")
    public String testParam(UserDate userDate) {
        System.out.println("自定义类型转换");
        System.out.println(userDate);
        return "success";
    }

    /*获取原生的Servlet API*/
    @RequestMapping(value = "testServlet")
    /*直接在方法内写上方法名字即可*/
    public String testParam(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getSession());
        return "success";
    }
}