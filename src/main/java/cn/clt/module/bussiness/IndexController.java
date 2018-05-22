package cn.clt.module.bussiness;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.User;
import cn.clt.core.entity.UserAccount;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.ArticleCode;
import cn.clt.core.enums.Code;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.mapper.UserInfoMapper;
import cn.clt.core.params.Result;
import cn.clt.core.service.*;
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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Description 首页管理
 * @Aouthor CLT
 * @Date 2018/04/13 16:14
 */
@Controller
@RequestMapping(value = "/home", produces = {"application/json;charset=UTF-8"})
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ConcernService concernService;
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private UserAccountService userAccountService;

    /**
     * @Title index
     * @Description 后台首页
     * @Author CLT
     * @Date 2018/4/13 16:18
     * @param model
     * @return
     */
    @RequestMapping(value = "/backstage/index", produces = {"application/json;charset=UTF-8"})
    public String backstageIndex(HttpSession session, Model model){
        //获取用户信息
        ActiveUser activeUser = activeUserService.getActiveUser(session);
        model.addAttribute("activeUser",activeUser);
        String userId = activeUser.getUserId();
        List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
        if (!CollectionUtils.isEmpty(userInfoList)){
            model.addAttribute("userInfo",userInfoList.get(0));
        }
        //获取用户账户信息
        UserAccount userAccount = userAccountService.getUserAccountByUserId(userId);
        model.addAttribute("userAccount",userAccount);
        //获取用户信息 用于判断是否是管理员
        User user = userService.getUserById(userId);
        if (user != null) {
            model.addAttribute("userRole", user);
        }
        //获取管理员发布的文章 用于公告信息
        List<Article> articleList = articleService.getArticleByAdmin(ArticleCode.AFFICHE.name());
        if (!CollectionUtils.isEmpty(articleList)){
            model.addAttribute("adminArticle",articleList);
        }
        return "home";
    }

    /**
     * @Title showIndex
     * @Description 前台首页（账户登录）
     * @Author CLT
     * @Date 2018/5/15 9:32
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/reception/index")
    public String receptionIndex(HttpSession session,Model model){
        try {
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            model.addAttribute("activeUser",activeUser);
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            if (!CollectionUtils.isEmpty(userInfoList)){
                model.addAttribute("userInfo",userInfoList.get(0));
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("登录失败.");
        }
        return "show";
    }

    /**
     * @Title receptionInit
     * @Description 前台首页初始化
     * @Author CLT
     * @Date 2018/5/15 9:44
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/reception/init")
    @ResponseBody
    public String receptionInit(HttpSession session, Model model, @RequestParam(defaultValue = "1") Integer pageNo,
                                @RequestParam(defaultValue = "10") Integer pageSize){
        try{
            //获取文章 公告 活动 热文 以及用户发布的其余文章四类
            Map<String,Object> rs = new HashMap<>();
            rs.put("headline",articleService.getArticleByArticleId(1,3,articleService.getArticleTypeId(ArticleCode.HEADLINE.name())));
            rs.put("affiche",articleService.getArticleByArticleId(1,3,articleService.getArticleTypeId(ArticleCode.AFFICHE.name())));
            rs.put("hot",articleService.getArticleByArticleId(1,6,articleService.getArticleTypeId(ArticleCode.HOT.name())));
            rs.put("activity",articleService.getArticleByArticleId(1,3,articleService.getArticleTypeId(ArticleCode.ACTIVITY.name())));
            rs.put("other",articleService.getArticleByArticleId(pageNo,pageSize,articleService.getArticleTypeId(ArticleCode.NEWS.name()), articleService.getArticleTypeId(ArticleCode.ENTERTAINMENT.name())));
            return Result.ok(Code.OK.getValue(),"获取首页信息成功.",rs);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取首页信息失败.");
            return Result.error("获取首页信息失败");
        }
    }
}
