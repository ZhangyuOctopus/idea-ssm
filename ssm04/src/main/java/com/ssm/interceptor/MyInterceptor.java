package com.ssm.interceptor;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyInterceptor implements HandlerInterceptor {
    /*预处理controller方法执行前执行*/
    //return true表示放行,执行下一个拦截器,如果没有就执行controller中的方法, return false不放行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //可以用来模拟权限的过程
        System.out.println("控制器方法执行前111");
        /*可以不放行请求转发到另外一个页面*/
        /*注意下面的在WEB-INF前面的路径中需要添加上/才不会出现错误*/
        /* request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);*/
        /*return true;*/
        /*不放行那么控制器的方法就不会被执行*/
        return true;
    }

    /*控制器方法执行后, success.jsp页面执行之前*/
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("控制器方法执行后111");
    }

    /*success.jsp页面执行之后*/
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        /*d当跳转页面之后可以释放掉一些没有用的资源*/
        System.out.println("success.jsp页面执行后111");
    }
}
