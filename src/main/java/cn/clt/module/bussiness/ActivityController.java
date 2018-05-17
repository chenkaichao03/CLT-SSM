package cn.clt.module.bussiness;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.ArticleCode;
import cn.clt.core.service.ArticleService;
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

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 活动
 * @Aouthor CLT
 * @Date 2018/05/07 14:44
 */
@Controller
@RequestMapping(value = "/activity", produces = {"application/json;charset=UTF-8"})
public class ActivityController {

    private static final Logger logger = LoggerFactory.getLogger(ActivityController.class);
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    /**
     * @Title listActivity
     * @Description 获取管理员发布的文章 用于活动
     * @Author CLT
     * @Date 2018/5/7 14:46
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String listActivity(HttpSession session, Model model){
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            //用户信息
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)) {
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo", userInfo);
            //获取
            List<Article> articleList = articleService.getArticleByAdmin(ArticleCode.ACTIVITY.name());
            if (!CollectionUtils.isEmpty(articleList)){
                model.addAttribute("adminArticle",articleList);
            }
            //判断改用户角色
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取活动失败");
        }
        return "activity";
    }
}
