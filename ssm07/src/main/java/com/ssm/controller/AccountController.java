package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/findall")
    public String findall(){
        System.out.println("表现层查询所有用户");
        return "success";
    }
}
