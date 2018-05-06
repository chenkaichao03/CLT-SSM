package cn.clt.core.mapper;

import cn.clt.core.entity.ArticleType;
import cn.clt.core.entity.ArticleTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ArticleTypeMapper {
    long countByExample(ArticleTypeExample example);

    int deleteByExample(ArticleTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    List<ArticleType> selectByExample(ArticleTypeExample example);

    ArticleType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);

    int updateByExample(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}