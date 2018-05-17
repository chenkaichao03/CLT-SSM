package cn.clt.core.service;
import cn.clt.core.entity.ArticleType;
import java.util.List;

/**
 * @Description ArticleTypeService
 * @Aouthor CLT
 * @Date 2018/04/25 14:32
 */
public interface ArticleTypeService {

    /**
     * @Title listArticleType
     * @Description 获取所有可用的文章类型
     * @Author CLT
     * @Date 2018/4/25 14:35
     * @return
     */
    List<ArticleType> listArticleType(String role);

    /**
     * @Title addArticleType
     * @Description 添加文章类型
     * @Author CLT
     * @Date 2018/4/25 15:08
     * @param articleType
     */
    void addArticleType(ArticleType articleType);

    /**
     * @Title getArticleTypeByName
     * @Description 获取文章类型通过名称
     * @Author CLT
     * @Date 2018/5/7 14:33
     * @param articleTypeName
     * @return
     */
    ArticleType getArticleTypeByName(String articleTypeName);

}
