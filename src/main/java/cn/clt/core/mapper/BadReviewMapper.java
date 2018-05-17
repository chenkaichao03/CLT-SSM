package cn.clt.core.mapper;

import cn.clt.core.entity.BadReview;
import cn.clt.core.entity.BadReviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BadReviewMapper {
    long countByExample(BadReviewExample example);

    int deleteByExample(BadReviewExample example);

    int deleteByPrimaryKey(String id);

    int insert(BadReview record);

    int insertSelective(BadReview record);

    List<BadReview> selectByExample(BadReviewExample example);

    BadReview selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BadReview record, @Param("example") BadReviewExample example);

    int updateByExample(@Param("record") BadReview record, @Param("example") BadReviewExample example);

    int updateByPrimaryKeySelective(BadReview record);

    int updateByPrimaryKey(BadReview record);
}