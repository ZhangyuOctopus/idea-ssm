package com.ssm.controller;
import com.ssm.entity.UserDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;
@Controller
@SessionAttributes(value = {"msg"})
/*将msg=zhangyu存储到session域中*/
/*常用的注解类注释*/
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("testRequestParam")
    public  String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("username = " + username);
        return "success";
    }

    @RequestMapping("testRequestBody")
    public  String testRequestBody(@RequestBody String body){
        System.out.println("body = " + body);
        return "success";
    }

    /*PathVariable注解, name后面的属性值与@RequestMapping后面的占位符的名字是一样的*/
    @RequestMapping("testPathVariable/{sid}")
    public  String testPathVariable(@PathVariable(name = "sid")String id){
        System.out.println(id);
        return "success";
    }

    /*ModelAttribute*/
    @RequestMapping("testModelAttribute")
    public  String testModelAttribute(@ModelAttribute("user") UserDate userDate){
        /*先执行下面的方法然后拿到这个方法返回的user*/
        System.out.println(userDate);
        return "success";
    }

    /*加了ModelAttribute会优先于testModelAttribute方法的执行*/
    /*@ModelAttribute
    public UserDate showUser(String name, Integer age){
        System.out.println("执行了");
        UserDate user = new UserDate();
        user.setAge(12);
        user.setName("zany");
        user.setDate(new Date());
        return user;
    }*/

    /*不存在返回值的情况*/
    @ModelAttribute
    public void showUser(UserDate userdate, Map<String, UserDate> map){
        System.out.println("执行了");
        UserDate user = new UserDate();
        user.setAge(userdate.getAge());
        user.setName(userdate.getName());
        user.setDate(new Date());
        map.put("user", user);
    }

    /*SessionAttribute*/
    @RequestMapping("testSessionAttribute")
    public  String testSessionAttribute(Model model){
        /*底层会将数据存储到request域对象中, 可以在success.jsp页面中取出值*/
        model.addAttribute("msg", "zhangyu");
        return "success";
    }

    /*SessionAttribute*/
    @RequestMapping("getSessionAttribute")
    public  String getSessionAttribute(ModelMap modelMap){
        String str = (String) modelMap.get("msg");
        System.out.println(str);
        return "success";
    }

    /*删除Session中的内容*/
    @RequestMapping("delSessionAttribute")
    public  String delSessionAttribute(SessionStatus status){
       status.setComplete();
        return "success";
    }
}