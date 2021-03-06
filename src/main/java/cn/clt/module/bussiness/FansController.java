package cn.clt.module.bussiness;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.service.ActiveUserService;
import cn.clt.core.service.ConcernService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.service.UserService;
import cn.clt.core.vo.ActiveUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 粉丝
 * @Aouthor CLT
 * @Date 2018/05/04 16:47
 */
@Controller
@RequestMapping(value = "/fans", produces = {"application/json;charset=UTF-8"})
public class FansController {

    @Autowired
    private ConcernService concernService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(FansController.class);

    /**
     * @Title listFans
     * @Description 获取粉丝列表
     * @Author CLT
     * @Date 2018/5/4 16:50
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String selectFansPage(HttpSession session, Model model,
                           String userManageId,
                           @RequestParam(defaultValue = "1") Integer pageNo,
                           @RequestParam(defaultValue = "10") Integer pageSize){
        try{
            //用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
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
            //粉丝列表 分页
            if (!StringUtils.isEmpty(userManageId)){
                userId = userManageId;
            }
            ManagementPageData pageData = concernService.selectFansPage(userId,pageNo,pageSize);
            model.addAttribute("pageData",pageData);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取粉丝列表失败.");
            throw new BussinessException("获取粉丝列表失败");
        }
        return "fans";
    }
}
