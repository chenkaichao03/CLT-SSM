package cn.clt.module.bussiness;
import cn.clt.core.entity.*;
import cn.clt.core.enums.ArticleCode;
import cn.clt.core.enums.Code;
import cn.clt.core.enums.ConcernCode;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Result;
import cn.clt.core.service.*;
import cn.clt.core.utils.DateUtil;
import cn.clt.core.vo.ActiveUser;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Description 文章管理
 * @Aouthor CLT
 * @Date 2018/04/25 14:22
 */
@Controller
@RequestMapping(value = "/article", produces = {"application/json;charset=UTF-8"})
public class ArticleController {

    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleTypeService articleTypeService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;
    @Autowired
    private ConcernService concernService;
    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private FabulousService fabulousService;
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ReviewDetailService reviewDetailService;
    @Autowired
    private GoodReviewService goodReviewService;
    @Autowired
    private BadReviewService badReviewService;


    @RequestMapping("type/list")
    public String listArticleType(HttpSession session,Model model){
        try {
            //用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            String role = activeUser.getRole();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            //文章类型信息
            List<ArticleType> articleTypeList = articleTypeService.listArticleType(role);
            model.addAttribute("articleTypeList",articleTypeList);
            model.addAttribute("userInfo",userInfo);
            //判断改用户角色
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取文章类型失败.",e.getMessage());
        }
        return "article";
    }

    /**
     * @Title addArticleType
     * @Description 添加文章类型
     * @Author CLT
     * @Date 2018/4/25 15:03
     * @param session
     * @return
     */
    @RequestMapping("/add/type")
    public String addArticleType(ArticleType articleType, HttpSession session){
        try {
            //添加文章类型
            articleTypeService.addArticleType(articleType);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("添加文章类型失败.",e.getMessage());
        }
        return "redirect:/home/backstage/index";
    }

    /**
     * @Title addArticle
     * @Description 添加、编辑文章
     * @Author CLT
     * @Date 2018/4/25 17:05
     * @param file
     * @param article
     * @param session
     * @return
     */
    @RequestMapping("/add")
    public String addArticle(@RequestParam(value = "articleFile",required = false)MultipartFile file, Article article,
                             HttpSession session, HttpServletRequest request)throws BussinessException{
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String path = request.getSession().getServletContext().getRealPath("article"); //文件存储位置
            //添加文章内容
            articleService.addArticle(file,article,activeUser.getUserId(),path);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("添加文章失败.",e.getMessage());
            throw new BussinessException(e.getMessage());
        }
        return "redirect:/article/list";
    }

    /**
     * @Title listArticle
     * @Description 获取用户文章 分页
     * @Author CLT
     * @Date 2018/4/26 9:57
     * @param session
     * @param pageNo
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String listArticle(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                              @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize,
                              HttpSession session,Model model){
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            //分页数据
            ManagementPageData pageResult = articleService.seletArticlePage(userId,pageNo,pageSize);
            model.addAttribute("pageResult",pageResult);
            model.addAttribute("userInfo",userInfo);
            //判断改用户角色
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取用户的文章失败.",e.getMessage());
            throw new BussinessException("获取用户的文章失败");
        }
        return "articlelist";
    }


    /**
     * @Title updateArticle
     * @Description 根据文章id展示文章信息(修改)
     * @Author CLT
     * @Date 2018/4/26 10:33
     * @param id
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public String updateArticle(@RequestParam(value = "id") String id,HttpSession session,Model model){
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            String role = activeUser.getRole();
            Article article = articleService.getArticleById(id);
            model.addAttribute("article",article);
            //文章类型信息
            List<ArticleType> articleTypeList = articleTypeService.listArticleType(role);
            model.addAttribute("articleTypeList",articleTypeList);
            //用户信息
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
        }catch (Exception e){
            e.printStackTrace();
            logger.error("文章获取失败.",e.getMessage());
            throw new BussinessException("文章获取失败.");
        }
        return "article";
    }

    /**
     * @Title showArticle
     * @Description 根据文章id展示文章信息
     * @Author CLT
     * @Date 2018/4/26 10:33
     * @param id
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String showArticle(@RequestParam(value = "id") String id,HttpSession session,Model model){
        try {
            //获取用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            String userId = null;
            if (activeUser != null){
                userId = activeUser.getUserId();
            }
            //获取文章信息
            Article article = articleService.getArticleById(id);
            article.setCreateTimeStr(DateUtil.formatDate(DateUtil.DATE_FORMATS[2],article.getCreateDate()));
            model.addAttribute("article",article);
            //布该文章的用户的用户信息
            String articleUserId = article.getCreateUserId();
            User user = userService.getUserById(articleUserId);
            if (user != null){
                model.addAttribute("user",user);
            }
            //用户头像 姓名信息
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(articleUserId);
            if (!CollectionUtils.isEmpty(userInfoList)){
                model.addAttribute("userInfo",userInfoList.get(0));
            }
            //判断关注状态
            if (!StringUtils.isEmpty(userId)) {
                Concern concern = concernService.getConcern(articleUserId, userId);
                if (concern != null && concern.getConcernType() == ConcernCode.CONCERN.getCode()) {
                    //已关注 就看下发布该文章的人是否也关注了自己 是的话把状态改成互相关注
                    Concern concern1 = concernService.getConcern(userId, articleUserId);
                    if (concern1 != null && concern1.getConcernType() == ConcernCode.CONCERN.getCode()) {
                        concern.setConcernType(ConcernCode.MUTUAL_CONCERN.getCode());
                    }
                    model.addAttribute("concernType", concern.getConcernType());
                }else {
                    model.addAttribute("concernType", 0);
                }
            }else {
                model.addAttribute("concernType", 0);
            }
            Map<String,Long> countFansAndConcern = concernService.countFansAndConcern(user.getId());
            model.addAttribute("countFansAndConcern",countFansAndConcern);
            //判断改用户角色
            if (!StringUtils.isEmpty(userId)) {
                User userRole = userService.getUserById(userId);
                model.addAttribute("userRole", userRole);
            }
            //热文
            model.addAttribute("hot",articleService.getArticleByArticleId(1,5,articleService.getArticleTypeId(ArticleCode.HOT.name())));
            //获取文章的点赞数
            Long countFabulous = fabulousService.totalFabulous(id);
            model.addAttribute("countFabulous",countFabulous);
            //获取评论数
            Long countReview = reviewService.countReview(id);
            model.addAttribute("countReview",countReview);
            //获取评论内容
            List<Review> reviewList = reviewService.listReview(id);
            model.addAttribute("reviewList",reviewList);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("文章获取失败.",e.getMessage());
            throw new BussinessException("文章获取失败.");
        }
        return "showpage";
    }


    /**
     * @Title deleteArticle
     * @Description 删除文章
     * @Author CLT
     * @Date 2018/4/26 10:41
     * @param id
     * @param session
     * @return
     */
    @RequestMapping("/delete")
    public String deleteArticle(@RequestParam(value = "id") String id,HttpSession session){
        try {
            //获取用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            articleService.deleteArticle(id,userId);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("删除文章失败.",e.getMessage());
            throw new BussinessException("删除文章失败.");
        }
        return "redirect:/article/list";
    }


    /**
     * @Title followUser
     * @Description 关注用户
     * @Author CLT
     * @Date 2018/5/3 14:32
     * @param concernedUserId 被关注的用户id
     * @param session
     * @return
     */
    @RequestMapping("/concern")
    @ResponseBody
    public String followUser(String concernedUserId,HttpSession session){
        try {
            //获取用户信息 当前用户
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            if (activeUser == null){
                return Result.error("兄dei,请登录.");
            }
            String userId = activeUser.getUserId();
            Integer concernType = concernService.concernUser(concernedUserId,userId);
            return Result.ok(Code.OK.getValue(),"关注操作成功",concernType);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("关注操作失败.");
        }
        return Result.error("关注操作失败.");
    }


    /**
     * @Title doFabulous
     * @Description 点赞操作
     * @Author CLT
     * @Date 2018/5/16 18:05
     * @param fabulous
     * @return
     */
    @RequestMapping("/fabulous")
    @ResponseBody
    public String doFabulous(Fabulous fabulous){
        try {
            if (StringUtils.isEmpty(fabulous.getFabulousUserId()) || StringUtils.isEmpty(fabulous.getArticleId())){
                return Result.error("兄dei,请登录.");
            }
            String id = fabulousService.doFabulous(fabulous);
            if (!StringUtils.isEmpty(id)){
                return Result.ok(Code.OK.getValue(),"点赞成功.",id);
            }
            return Result.error("点赞失败.");
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("点赞操作.");
            return Result.error("点赞操作.");
        }
    }

    /**
     * @Title publishComment
     * @Description 对文章进行发表评论
     * @Author CLT
     * @Date 2018/5/17 9:44
     * @param review
     * @return
     */
    @RequestMapping("/review")
    @ResponseBody
    public String publishComment(Review review){
        try {
            if (StringUtils.isEmpty(review.getArticleId()) || StringUtils.isEmpty(review.getReviewUserId())){
                return Result.error("兄dei,请登录.");
            }
            String id = reviewService.insertReview(review);
            if (StringUtils.isEmpty(id)){
                return Result.error("发表评论失败.");
            }
            return Result.ok(Code.OK.getValue(),"发表评论成功.",id);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("发表评论失败.");
            return Result.error("发表评论失败.");
        }
    }


    /**
     * @Title remarkOn
     * @Description 点评评论
     * @Author CLT
     * @Date 2018/5/17 10:14
     * @param reviewDetail
     * @return
     */
    @RequestMapping("/remark/on")
    @ResponseBody
    public String remarkOn(ReviewDetail reviewDetail){
        try {
            if (StringUtils.isEmpty(reviewDetail.getReviewUserId())){
                return Result.error("兄dei,请登录.");
            }
            String id = reviewDetailService.insertReviewDetail(reviewDetail);
            if (StringUtils.isEmpty(id)){
                return Result.error("点评评论失败.");
            }
            return Result.ok(Code.OK.getValue(),"点评评论成功.",id);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("点评评论失败.");
            return Result.error("点评评论失败.");
        }
    }

    /**
     * @Title goodReview
     * @Description 评论好评
     * @Author CLT
     * @Date 2018/5/17 12:42
     * @param goodReview
     * @return
     */
    @RequestMapping("/good/review")
    @ResponseBody
    public String goodReview(GoodReview goodReview){
        try {
            if (StringUtils.isEmpty(goodReview.getGoodReviewUserId())){
                return Result.error("兄dei,请登录.");
            }
            String id = goodReviewService.insertGoodReview(goodReview);
            if (StringUtils.isEmpty(id)){
                return Result.error("评论好评失败.");
            }
            return Result.ok(Code.OK.getValue(),"评论好评成功.",id);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("评论好评失败.");
            return Result.error("评论好评失败.");
        }
    }


    /**
     * @Title badReview
     * @Description 评论差评
     * @Author CLT
     * @Date 2018/5/17 12:43
     * @param badReview
     * @return
     */
    @RequestMapping("/bad/review")
    @ResponseBody
    public String badReview(BadReview badReview){
        try {
            if (StringUtils.isEmpty(badReview.getBadReviewUserId())){
                return Result.error("兄dei,请登录.");
            }
            String id = badReviewService.insertBadReview(badReview);
            if (StringUtils.isEmpty(id)){
                return Result.error("评论差评失败.");
            }
            return Result.ok(Code.OK.getValue(),"评论差评成功.",id);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("评论好评失败.");
            return Result.error("评论好评失败.");
        }
    }


}
