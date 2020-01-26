package com.ssm.exception;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*异常处理器类*/
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    /*前端控制器捕获到异常会调用异常处理器类来处理异常*/
    /*处理异常业务逻辑*/
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        /*拿到前端控制器抛出的异常: 捕获的异常对象*/
        SysException ex = null;
        if(e instanceof SysException){
            ex = (SysException)e;
        }else{
            ex = new SysException("系统正在维护......");
        }
        /*看到上面的返回值为ModelAndView所以可以新建ModelAndView对象*/
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", ex.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
