package cn.clt.core.service;

import cn.clt.core.entity.Article;
import cn.clt.core.params.ManagementPageData;
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
}
