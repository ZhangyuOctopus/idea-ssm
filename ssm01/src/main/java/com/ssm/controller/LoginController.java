package com.ssm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(path = "/login")
    public  String login(){
        System.out.println("login");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping",params = {"username"})
    public  String testRequestMapping(){
        System.out.println("login");
        return "success";
    }
}