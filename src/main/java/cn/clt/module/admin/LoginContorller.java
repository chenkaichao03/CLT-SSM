package cn.clt.module.admin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.function.BiFunction;

/**
 * @Description 登录
 * @Aouthor CLT
 * @Date 2018/04/06 17:56
 */
@RequestMapping("/shiro")
@Controller
public class LoginContorller {

    private static final Logger logger = LoggerFactory.getLogger(LoginContorller.class);


    @RequestMapping("/login")
    public String sign(@RequestParam(value = "username") String username,
                     @RequestParam(value = "password") String password){
        //获取用户subject
        Subject currentUser= SecurityUtils.getSubject();
        //判断用户是否被认证
        if (!currentUser.isAuthenticated()){
            //把账户密码封装到UsernamePasswordToken中
            BiFunction<String,String,UsernamePasswordToken> biFunction = UsernamePasswordToken::new;
            UsernamePasswordToken token = biFunction.apply(username,password);
            //remember me
            token.setRememberMe(true);
            try{
                //执行登录
                currentUser.login(token);
            }catch (AuthenticationException e){
                logger.info("登录异常！", e.getMessage());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return "redirect:/views/list.jsp";
    }

}
