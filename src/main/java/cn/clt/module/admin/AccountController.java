package cn.clt.module.admin;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserAccount;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.Code;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.enums.LoginTypeCode;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.Result;
import cn.clt.core.service.ActiveUserService;
import cn.clt.core.service.UserAccountService;
import cn.clt.core.service.UserInfoService;
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
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Description 账户管理
 * @Aouthor CLT
 * @Date 2018/04/06 17:56
 */
@Controller
@RequestMapping(value = "/account", produces = {"application/json;charset=UTF-8"})
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserAccountService userAccountService;


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
                         @RequestParam(value = "password") String password,String loginType,String articleId)throws BussinessException{
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
           throw new BussinessException("用户/密码不能为空");
        }
        ActiveUser activeUser = userService.authenticat(username,password);
        String userId = activeUser.getUserId();
        if (!StringUtils.isEmpty(userId)){
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            if (!CollectionUtils.isEmpty(userInfoList)){
                UserInfo userInfo = userInfoList.get(0);
                activeUser.setUserInfoId(userInfo.getId());
                activeUser.setUserPicture(userInfo.getUserPicture());
            }
        }
        session.setAttribute("activeUser",activeUser);
        //登录的时候重新统计该用户的文章浏览量
        int resule = userAccountService.statisticsUserAccountByUserId(userId);
        if (resule == 1){
            System.out.println("------------已经统计了浏览量，id为："+userId + "-------------------");
        }else {
            System.out.println("------------没有统计了浏览量（可能不存在该用户，或文章），id为："+userId + "-------------------");
        }
        //userAccountService.updateUserExchangeBalanceAccount(userId);
        if (loginType.equals(LoginTypeCode.HOME_PAGE_LOGIN.name())){
            //前台页面
            return "redirect:/home/reception/index";
        } else if (loginType.equals(LoginTypeCode.BACKSTAGE.name())) {
            //后台页面
            return "redirect:/home/backstage/index";
        }else if(loginType.equals(LoginTypeCode.SHOW_PAGE.name())){
            //文章详情登录
            return "redirect:/article/show?id="+articleId;
        }
        return "redirect:/account/logout";
    }

    /**
     * @Title signout
     * @Description 登出
     * @Author CLT
     * @Date 2018/4/8 15:43
     * @return
     */
    @RequestMapping("/logout")
    @ResponseBody
    public String signout(String loginType,HttpSession session){
        try {
            if (!LoginTypeCode.checkLoginTypeCode(loginType)){
                return Result.error("错误登录类型.");
            }
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            if (activeUser != null){
                session.removeAttribute("activeUser");
                session.invalidate();
            }
            return Result.ok(Code.OK.getValue(),"登出成功.",loginType);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("登出失败.");
            return Result.error("登出失败.");
        }
    }

    @RequestMapping("/signout")
    public String backstageSignout(HttpSession session){
        try{
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            if (activeUser != null){
                session.removeAttribute("activeUser");
                session.invalidate();
            }
            return "login";
        }catch (Exception e){
            e.printStackTrace();
            logger.error("登出失败.");
            throw new BussinessException("登出失败.");
        }
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

    /**
     * @Title homeRegister
     * @Description 前台注册
     * @Author CLT
     * @Date 2018/5/14 16:14
     * @param username
     * @param password
     * @return
     * @throws BussinessException
     */
    @RequestMapping("/home/register")
    @ResponseBody
    public String homeRegister(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password){
        try {
            if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
                throw new BussinessException("用户/密码不能为空");
            }
            //新增用户
            String userId = userService.insertPrUser(username, password);
            return Result.ok(Code.OK.getValue(),"注册成功.",userId);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("注册失败.");
            return Result.error("注册失败.");
        }
    }

    /**
     * @Title getUserInfo
     * @Description 获取用户信息
     * @Author CLT
     * @Date 2018/4/22 15:15
     * @return
     */
    @RequestMapping("/get/user-info")
    public String getUserInfo(HttpSession session,Model model){
        //获取用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        String id = activeUser.getUserInfoId();
        UserInfo userInfo = null;
        if (!StringUtils.isEmpty(id)){
            List<UserInfo> userInfoList = userInfoService.listUserInfo(id);
            if (!CollectionUtils.isEmpty(userInfoList)) {
                userInfo = userInfoList.get(0);
                //获取用户信息 用于判断是否是管理员
                User user = userService.getUserById(userInfo.getUserId());
                model.addAttribute("userRole", user);
            }
        }
        model.addAttribute("activeUser",activeUser);
        model.addAttribute("userInfo",userInfo);
        return "userinfo";
    }

    /**
     * @Title getUserPicture
     * @Description 获取用户头像
     * @Author CLT
     * @Date 2018/4/25 10:13
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "/get/picture")
    public String getUserPicture(HttpSession session,Model model){
        //获取用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        String userId = activeUser.getUserId();
        List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
        UserInfo userInfo = null;
        if (!CollectionUtils.isEmpty(userInfoList)){
            userInfo = userInfoList.get(0);
        }
        model.addAttribute("userInfo",userInfo);
        //判断改用户角色
        User user = userService.getUserById(userId);
        if (user != null) {
            model.addAttribute("userRole", user);
        }
        return "usersetting";
    }

    /**
     * @Title uploadPicture
     * @Description 上传图片
     * @Author CLT
     * @Date 2018/4/22 13:22
     * @param file
     * @param request
     * @return
     */
    @RequestMapping(value = "/upload/picture",method = RequestMethod.POST)
    public String uploadPicture(@RequestParam(value = "userimage",required = false) MultipartFile file,
                                HttpServletRequest request,HttpSession session)throws Exception{
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String path = request.getSession().getServletContext().getRealPath("upload"); //文件存储位置
            //用户头像设置
            userInfoService.userPictureSetting(activeUser.getUserId(),file,path);
        } catch (BussinessException e){
            throw new BussinessException(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            logger.error("上传图片失败.",e.getMessage());
        }
        return "redirect:/home/backstage/index";
    }

    /**
     * @Title userInfoSetting
     * @Description 用户信息设置
     * @Author CLT
     * @Date 2018/4/25 11:25
     * @param userInfo
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "/user-info/setting")
    public String userInfoSetting(UserInfo userInfo,HttpSession session,Model model) throws Exception{
        try{
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            //用户信息设置
            String id = userInfoService.insertUserInfo(userInfo,userId);
            activeUser.setUserInfoId(id);
        }catch (BussinessException e){
            throw new BussinessException(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            logger.error("用户信息设置失败.",e.getMessage());
        }
        return "redirect:/home/backstage/index";
    }

     /**
     * @Title erificationUserInfo
     * @Description 手机号校验
     * @Author CLT
     * @Date 2018/4/24 15:23
     * @param userName
     * @param phone
     * @return
     */
    @RequestMapping(value = "/check/user",method = RequestMethod.GET)
    public String checkUser(@RequestParam(value = "userName") String userName,
                                      @RequestParam(value = "phone") String phone,Model model) throws BussinessException{
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(phone)){
            throw new BussinessException("用户名/手机号不能为空");
        }
        String userId = userService.erificationUserInfo(userName,phone);
        model.addAttribute("userId",userId);
        return "forgetpwd2";
    }

    /**
     * @Title passwordSetting
     * @Description 设置新密码
     * @Author CLT
     * @Date 2018/4/24 15:43
     * @param password
     * @param newPassword
     * @return
     */
    @RequestMapping(value = "/password/setting",method = RequestMethod.GET)
    public String passwordSetting(@RequestParam(value = "userId") String userId,
                                     @RequestParam(value = "password") String password,
                                     @RequestParam(value = "newPassword") String newPassword,Model model){
        if (StringUtils.isEmpty(password) || StringUtils.isEmpty(userId) || StringUtils.isEmpty(newPassword)){
            throw new BussinessException("手机号/密码/新密码不能为空");
        }
        userId = userService.passwordSetting(userId,password,newPassword);
        model.addAttribute("userId",userId);
        return "forgetpwd3";
    }
}
