package cn.clt.core.mapper;

import cn.clt.core.entity.Review;
import cn.clt.core.entity.ReviewExample;
import java.util.List;
import java.util.Map;

import cn.clt.core.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ReviewMapper {
    long countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(String id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExampleWithBLOBs(ReviewExample example);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKeyWithBLOBs(Review record);

    int updateByPrimaryKey(Review record);

    List<Review> listReview(Map<String,Object> params);

    Long countReview(Map<String,Object> params);

    List<ReviewVO> listReviewVo(Map<String,Object> params);

    Long countReviewVo(Map<String,Object> params);

    List<ReviewVO> listReviewPage(Map<String,Object> params);

    Long countReviewPage(Map<String,Object> params);
}