package cn.clt.module.bussiness;

import cn.clt.core.entity.UserInfo;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.service.*;
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
import java.util.Map;

/**
 * @Description 个人中心
 * @Aouthor CLT
 * @Date 2018/05/21 14:01
 */
@Controller
@RequestMapping(value = "/individual", produces = {"application/json;charset=UTF-8"})
public class PersonIndexController {

    private static final Logger logger = LoggerFactory.getLogger(PersonIndexController.class);

    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ConcernService concernService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ReviewDetailService reviewDetailService;

    /**
     * @Title individualCenterInit
     * @Description 个人中心
     * @Author CLT
     * @Date 2018/5/21 14:05
     * @param session
     * @param model
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/init/center")
    public String individualCenterInit(HttpSession session, Model model,
                                       @RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       String userId){
        try{
            //用户头像 姓名信息
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            if (!CollectionUtils.isEmpty(userInfoList)){
                model.addAttribute("userInfo",userInfoList.get(0));
            }
            //获取关注个数和粉丝个数
            Map<String,Long> countFansAndConcern = concernService.countFansAndConcern(userId);
            model.addAttribute("countFansAndConcern",countFansAndConcern);
            //获取该用户文章
            ManagementPageData pageData = articleService.selectArticlePage(userId,pageNo,pageSize);
            model.addAttribute("pageData",pageData);
            //获取该用户的评论
            ManagementPageData reviewPageData  = reviewService.selectReviewCommentPage(userId,pageNo,pageSize);
            model.addAttribute("reviewPageData",reviewPageData);
            //获取该用户点评
            ManagementPageData reviewDetailPageData = reviewDetailService.selectReviewDetailPage(userId,pageNo,pageSize);
            model.addAttribute("reviewDetailPageData",reviewDetailPageData);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取个人中心失败.");
            throw new BussinessException("获取个人中心失败");
        }
        return "usercenter";
    }
}
