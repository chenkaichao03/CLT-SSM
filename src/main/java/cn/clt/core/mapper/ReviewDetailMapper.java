package cn.clt.core.mapper;

import cn.clt.core.entity.ReviewDetail;
import cn.clt.core.entity.ReviewDetailExample;
import java.util.List;
import java.util.Map;

import cn.clt.core.vo.ReviewDetalVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ReviewDetailMapper {
    long countByExample(ReviewDetailExample example);

    int deleteByExample(ReviewDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReviewDetail record);

    int insertSelective(ReviewDetail record);

    List<ReviewDetail> selectByExampleWithBLOBs(ReviewDetailExample example);

    List<ReviewDetail> selectByExample(ReviewDetailExample example);

    ReviewDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReviewDetail record, @Param("example") ReviewDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ReviewDetail record, @Param("example") ReviewDetailExample example);

    int updateByExample(@Param("record") ReviewDetail record, @Param("example") ReviewDetailExample example);

    int updateByPrimaryKeySelective(ReviewDetail record);

    int updateByPrimaryKeyWithBLOBs(ReviewDetail record);

    int updateByPrimaryKey(ReviewDetail record);

    List<ReviewDetalVO> listReviewDetailPage(Map<String,Object> params);

    Long countReviewDetailPage(Map<String,Object> params);
}