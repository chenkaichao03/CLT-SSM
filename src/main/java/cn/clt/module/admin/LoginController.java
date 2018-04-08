package cn.clt.module.admin;

import cn.clt.core.enums.Code;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.Result;
import cn.clt.core.service.PrUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.function.BiFunction;

/**
 * @Description 账户
 * @Aouthor CLT
 * @Date 2018/04/06 17:56
 */
@Controller
@RequestMapping(value = "/account", produces = {"application/json;charset=UTF-8"})
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private PrUserService prUserService;


    /**
     * @Title signin
     * @Description 登录
     * @Author CLT
     * @Date 2018/4/8 10:47
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String signin(@RequestParam(value = "username") String username,
                     @RequestParam(value = "password") String password){
        //获取用户subject
        Subject currentUser= SecurityUtils.getSubject();
        //判断用户是否被认证
        if (!currentUser.isAuthenticated()){
            //把账户密码封装到UsernamePasswordToken中
            BiFunction<String,String,UsernamePasswordToken> biFunction = UsernamePasswordToken::new;
            UsernamePasswordToken token = biFunction.apply(username,password);
            //remember me
            //token.setRememberMe(true);
            try{
                //执行登录
                currentUser.login(token);
            }catch (AuthenticationException e){
                logger.info("登录异常！", e.getMessage());
                e.printStackTrace();
                token.clear();
            }
        }
        return "redirect:/views/list.jsp";
    }

    /**
     * @Title signout
     * @Description 登出
     * @Author CLT
     * @Date 2018/4/8 15:43
     * @return
     */
    @RequestMapping("/logout")
    public String signout(){
        return "redirect:/views/login.jsp";
    }


    /**
     * @Title register
     * @Description 注册
     * @Author CLT
     * @Date 2018/4/8 15:45
     * @return
     */
    @RequestMapping("/register")
    public String register(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password){
        try {
            if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
                return Result.error("参数错误.");
            }
            //新增用户
            prUserService.insertPrUser(username,password);
            return Result.ok(Code.OK.getValue(),"注册成功.","");
        }catch (BussinessException e){
            return Result.error(e.getMessage());
        } catch (Exception e){
            logger.info("注册失败.",e.getMessage());
            return Result.error("注册失败.");
        }
    }
}
