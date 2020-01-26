package com.ssm.controller;
import com.ssm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @RequestMapping(path = "testString")
    /*使用model来进行值的传递*/
    public String testString(Model model){
        System.out.println("成功执行");
        /*模拟从数据库中查询出来*/
        User user = new User();
        user.setAge(12);
        user.setPassword("123456");
        user.setUsername("zhangyu");
        model.addAttribute("user", user);
        return "success";
    }

   /* @RequestMapping(path = "testVoid")
    *//*返回值类型是void*//*
    public void testVoid(Model model){
        System.out.println("成功执行");
    }*/

    /*请求转发是一次请求不用写项目的名字*/
    /*@RequestMapping(path = "testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        *//*还是往成功的页面进行跳转*//*
        request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request,response);
        return;
    }*/

    /*重定向是两次请求, 不能够直接到WEB-INF目录下*/
    @RequestMapping(path = "testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //*还是往成功的页面进行跳转*//*
        System.out.println(request.getContextPath());
//        response.sendRedirect(request.getContextPath() + "/index.jsp");
        /*设置中文乱码*/
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("hello");
        return;
    }

    @RequestMapping(path = "testModelAndView")
    /*返回ModelAndView对象*/
    public ModelAndView testModelAndView(ModelAndView modelAndView){
        /*创建ModelAndView对象*/
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setAge(12);
        user.setPassword("123456");
        user.setUsername("zhangyu");
        /*将user对象存储到mv对象，也会把对象存储到request对象中*/
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }

    /*使用ajax来模拟异步请求和响应的过程*/
    @RequestMapping(path = "testJson")
    @ResponseBody
    /*将对象转换为字符串响应*/
    public User testJson(@RequestBody User user){
        /*客户端发送ajax请求, 传的是json字符串, 后端把json字符串封装到user对象中*/
        System.out.println(user);
        /*做响应*/
        user.setPassword("456");
        user.setAge(24);
        return user;
    }
}
