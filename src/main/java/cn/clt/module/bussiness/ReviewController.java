package cn.clt.module.bussiness;

import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.Code;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Result;
import cn.clt.core.service.ActiveUserService;
import cn.clt.core.service.ReviewService;
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
 * @Description 评论管理
 * @Aouthor CLT
 * @Date 2018/05/21 11:40
 */
@Controller
@RequestMapping(value = "/review", produces = {"application/json;charset=UTF-8"})
public class ReviewController {

    private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);

    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;
    @Autowired
    private ReviewService reviewService;


    /**
     * @Title listReview
     * @Description 获取评论 分页
     * @Author CLT
     * @Date 2018/5/21 11:43
     * @param session
     * @param model
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/list")
    public String listReview(HttpSession session, Model model,
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
            ManagementPageData pageData = reviewService.listReviewComment(userId,pageNo,pageSize);
            model.addAttribute("pageData",pageData);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取评论失败.");
            throw new BussinessException("获取评论失败.");
        }
        return "comment";
    }


    /**
     * @Title deleteReview
     * @Description 删除评论
     * @Author CLT
     * @Date 2018/5/21 17:04
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String deleteReview(String id,Model model){
        try {
            if (StringUtils.isEmpty(id)){
                return Result.error("id不能为空.");
            }
            Integer result = reviewService.deleteReview(id);
            return Result.ok(Code.OK.getValue(),"删除评论成功.",result);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("删除评论失败.");
            return Result.error("删除评论失败.");
        }
    }
}
