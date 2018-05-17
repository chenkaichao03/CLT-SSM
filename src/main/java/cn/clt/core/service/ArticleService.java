package cn.clt.core.service;

import cn.clt.core.entity.Article;
import cn.clt.core.enums.ArticleCode;
import cn.clt.core.params.ManagementPageData;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description ArticleService
 * @Aouthor CLT
 * @Date 2018/04/25 17:42
 */
public interface ArticleService {

    /**
     * @Title addArticle
     * @Description 添加文章
     * @Author CLT
     * @Date 2018/4/25 17:07
     * @param file
     * @param article
     * @param userId
     * @param path
     */
    void addArticle(MultipartFile file, Article article, String userId, String path);

    /**
     * @Title seletArticlePage
     * @Description 获取用户文章 分页
     * @Author CLT
     * @Date 2018/4/26 10:05
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    ManagementPageData seletArticlePage(String userId, Integer pageNo, Integer pageSize);

    /**
     * @Title getArticleByUserId
     * @Description 获取用户文章
     * @Author CLT
     * @Date 2018/4/26 10:24
     * @param userId
     * @return
     */
    List<Article> getArticleByUserId(String userId);

    /**
     * @Title getArticleByIdAndUserId
     * @Description 根据id获取文章
     * @Author CLT
     * @Date 2018/4/26 10:35
     * @param id
     * @param userId
     * @return
     */
    Article getArticleByIdAndUserId(String id,String userId);


    /**
     * @Title getArticleById
     * @Description 根据id获取文章
     * @Author CLT
     * @Date 2018/5/7 13:46
     * @param id
     * @return
     */
    Article getArticleById(String id);

    /**
     * @Title deleteArticle
     * @Description 删除文章
     * @Author CLT
     * @Date 2018/4/26 10:47
     * @param id
     * @param userId
     * @return
     */
    int  deleteArticle(String id,String userId);

    /**
     * @Title getArticleByAdmin
     * @Description 获取管理员的文章
     * @Author CLT
     * @Date 2018/5/4 15:05
     * @return
     */
    List<Article> getArticleByAdmin(String articleCode);

    /**
     * @Title getSrticleByArticleCode
     * @Description 根据文章类型获取文章
     * @Author CLT
     * @Date 2018/5/15 9:47
     * @param articleId
     * @return
     */
    List<Article> getArticleByArticleId(Integer pageNo, Integer pageSize, String... articleId);

    /**
     * @Title getArticleTypeId
     * @Description 获取文章类型id
     * @Author CLT
     * @Date 2018/5/15 11:17
     * @param articleCode
     * @return
     */
    String getArticleTypeId(String articleCode);
}
