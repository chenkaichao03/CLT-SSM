package cn.clt.module.bussiness;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.service.ActiveUserService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.service.UserService;
import cn.clt.core.vo.ActiveUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 用户管理
 * @Aouthor CLT
 * @Date 2018/05/09 11:24
 */
@Controller
@RequestMapping(value = "/user/manage", produces = {"application/json;charset=UTF-8"})
public class UserManageController {

    private static final Logger logger = LoggerFactory.getLogger(UserManageController.class);
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String selectUserPage(HttpSession session, Model model,
                                 @RequestParam(defaultValue = "1") Integer pageNo,
                                 @RequestParam(defaultValue = "10") Integer pageSize){
        try {
            //获取用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo",userInfo);
            //获取用户信息 用于判断是否是管理员
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
            //获取用户列表
            ManagementPageData pageData = userInfoService.selectUserPage(pageNo,pageSize);
            model.addAttribute("pageData",pageData);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取用户列表失败");
            throw new BussinessException("获取用户列表失败");
        }
        return "umanage";
    }
}
