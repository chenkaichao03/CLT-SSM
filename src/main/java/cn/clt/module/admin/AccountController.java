package cn.clt.module.admin;

import cn.clt.core.enums.Code;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.Result;
import cn.clt.core.service.UserService;
import cn.clt.core.vo.ActiveUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

/**
 * @Description 账户
 * @Aouthor CLT
 * @Date 2018/04/06 17:56
 */
@Controller
@RequestMapping(value = "/account", produces = {"application/json;charset=UTF-8"})
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private UserService userService;


    /**
     * @Title signin
     * @Description 登录
     * @Author CLT
     * @Date 2018/4/13 15:47
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public String signin(HttpSession session, @RequestParam(value = "username") String username,
                         @RequestParam(value = "password") String password)throws BussinessException{
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
           throw new BussinessException("用户/密码不能为空");
        }
        ActiveUser activeUser = userService.authenticat(username,password);
        session.setAttribute("activeUser",activeUser);
        return "redirect:/home/index";
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
        return "login";
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
                           @RequestParam(value = "password") String password)throws BussinessException{
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            throw new BussinessException("用户/密码不能为空");
        }
        //新增用户
        userService.insertPrUser(username,password);
        return "login";
    }


}
