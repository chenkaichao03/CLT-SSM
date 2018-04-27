package cn.clt.module.bussiness;
import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleType;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.service.ArticleService;
import cn.clt.core.service.ArticleTypeService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.vo.ActiveUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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


    @RequestMapping("type/list")
    public String listArticleType(HttpSession session,Model model){
        try {
            //用户信息
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            //文章类型信息
            List<ArticleType> articleTypeList = articleTypeService.listArticleType();
            model.addAttribute("articleTypeList",articleTypeList);
            model.addAttribute("userInfo",userInfo);
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
        return "redirect:/home/index";
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
            String path = request.getSession().getServletContext().getRealPath("articleUpload"); //文件存储位置
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
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取用户的文章失败.",e.getMessage());
            throw new BussinessException("获取用户的文章失败");
        }
        return "articlelist";
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
            ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
            String userId = activeUser.getUserId();
            Article article = articleService.getArticleById(id);
            model.addAttribute("article",article);
            //文章类型信息
            List<ArticleType> articleTypeList = articleTypeService.listArticleType();
            model.addAttribute("articleTypeList",articleTypeList);
            //用户信息
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo",userInfo);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("文章获取失败.",e.getMessage());
            throw new BussinessException("文章获取失败.");
        }
        return "article";
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
}
