package cn.clt.module.bussiness;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.Code;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Result;
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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 关注
 * @Aouthor CLT
 * @Date 2018/05/07 15:14
 */
@Controller
@RequestMapping(value = "/concern", produces = {"application/json;charset=UTF-8"})
public class ConcernController {

    private static final Logger logger = LoggerFactory.getLogger(ConcernController.class);
    @Autowired
    private ConcernService concernService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    /**
     * @Title listConcern
     * @Description 获取关注列表
     * @Author CLT
     * @Date 2018/5/7 15:18
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String selectConcernPage(HttpSession session, Model model,String userManageId,
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
            //判断改用户角色
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
            //获取关注列表 分页
            if (!StringUtils.isEmpty(userManageId)){
                userId = userManageId;
            }
            ManagementPageData pageData = concernService.selectConcernPage(userId,pageNo,pageSize);
            model.addAttribute("pageData",pageData);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取关注列表失败");
            throw new BussinessException("获取关注列表失败");
        }
        return "followuser";
    }


    /**
     * @Title cancelConcern
     * @Description 取消关注
     * @Author CLT
     * @Date 2018/5/8 17:46
     * @param session
     * @param model
     * @param concernedUser 被关注者id
     * @return
     */
    @RequestMapping("/cancel")
    @ResponseBody
    public String cancelConcern(HttpSession session, Model model,String concernedUser){
        try {
            //获取用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            String userId = activeUser.getUserId();
            //取消关注操作
            int result = concernService.cancelConcern(userId,concernedUser);
            if (result == 1) {
                return Result.ok(Code.OK.getValue(), "取消关注成功.", null);
            }else {
                return Result.error("取消关注失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("取消关注失败.");
            return Result.error("取消关注失败.");
        }
    }

}
