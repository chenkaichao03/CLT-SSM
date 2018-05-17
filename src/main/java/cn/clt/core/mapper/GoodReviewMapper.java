package cn.clt.core.mapper;

import cn.clt.core.entity.GoodReview;
import cn.clt.core.entity.GoodReviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GoodReviewMapper {
    long countByExample(GoodReviewExample example);

    int deleteByExample(GoodReviewExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodReview record);

    int insertSelective(GoodReview record);

    List<GoodReview> selectByExample(GoodReviewExample example);

    GoodReview selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodReview record, @Param("example") GoodReviewExample example);

    int updateByExample(@Param("record") GoodReview record, @Param("example") GoodReviewExample example);

    int updateByPrimaryKeySelective(GoodReview record);

    int updateByPrimaryKey(GoodReview record);
}