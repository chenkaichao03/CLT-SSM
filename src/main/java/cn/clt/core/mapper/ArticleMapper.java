package cn.clt.core.mapper;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleExample;
import cn.clt.core.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface ArticleMapper {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> listArticle(Map<String,Object> param);

    List<Article> listAdminArticle(String adminId);

    Long countArticle(Map<String,Object> params);

    List<Article> getArticleByArticleCode(Map<String,Object> params);

    List<Article> listArticlePage(Map<String,Object> params);

    Long countArticlePage(Map<String,Object> params);


}