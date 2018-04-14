package cn.clt.core.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description 自定义异常处理器
 * @Aouthor CLT
 * @Date 2018/04/14 23:27
 */
public class BussinessExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        //输出异常
        e.printStackTrace();

        //统一异常处理代码
        //针对系统自定义的CustomException异常，就可以直接从异常类中获取异常信息，将异常处理在错误页面展示
        //异常信息
        String message = null;
        BussinessException bussinessException = null;
        //如果ex是系统 自定义的异常，直接取出异常信息
        if(e instanceof BussinessException){
            bussinessException = (BussinessException) e;
        }else{
            //针对非CustomException异常，对这类重新构造成一个CustomException，异常信息为“未知错误”
            bussinessException = new BussinessException("未知错误");
        }

        //错误 信息
        message = bussinessException.getMessage();

        request.setAttribute("message", message);


        try {
            //转向到错误 页面
            request.getRequestDispatcher("/views/error.jsp").forward(request, response);
        } catch (ServletException ex) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new ModelAndView();
    }
}
