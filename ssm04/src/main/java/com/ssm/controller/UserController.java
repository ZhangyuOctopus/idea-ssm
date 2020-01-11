package com.ssm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping("testInterceptor")
    public String testException() {
        System.out.println("执行了");
        return "success";
    }
}