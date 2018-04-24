package cn.clt.module.admin;

import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.Code;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.Result;
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
    @Autowired
    private UserInfoService userInfoService;


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
            }
        }
        model.addAttribute("activeUser",activeUser);
        model.addAttribute("userInfo",userInfo);
        return "userinfo";
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
                                UserInfo userInfo,HttpServletRequest request)throws Exception{
        try {
            //获取上传图片全称
            String originalFileName = file.getOriginalFilename();
            if (!StringUtils.isEmpty(file)){
                //文件存储位置
                String path = request.getSession().getServletContext().getRealPath("upload"); //文件存储位置
                //获取图片格式
                String pictureFormat = originalFileName.substring(originalFileName.lastIndexOf("."),originalFileName.length());
                //随机数
                String pictureRandom = new Date().getTime()+"_"+new Random().nextInt(1000);
                //组装新的图片全称
                originalFileName=pictureRandom+pictureFormat;//新的文件名
                //判断文件夹是否存在
                File pathFile = new File(path);
                if (!pathFile.getParentFile().exists()){
                    pathFile.getParentFile().mkdir();
                }
                File targetFile = new File(pathFile, originalFileName);
                //写入到服务器上
                file.transferTo(targetFile);
                //写入数据
                userInfoService.insertUserInfo(userInfo,originalFileName,pathFile);
            }
        } catch (BussinessException e){
            logger.error(e.getMessage());
            throw new BussinessException("上传图片失败.");
        } catch (Exception e){
            e.printStackTrace();
            logger.error("上传图片失败.",e.getMessage());
        }
        return "redirect:/home/index";
    }

}
