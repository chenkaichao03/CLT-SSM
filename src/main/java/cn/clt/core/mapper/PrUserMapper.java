package cn.clt.core.mapper;

import cn.clt.core.entity.PrUser;
import cn.clt.core.entity.PrUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PrUserMapper {
    long countByExample(PrUserExample example);

    int deleteByExample(PrUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(PrUser record);

    int insertSelective(PrUser record);

    List<PrUser> selectByExample(PrUserExample example);

    PrUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") PrUser record, @Param("example") PrUserExample example);

    int updateByExample(@Param("record") PrUser record, @Param("example") PrUserExample example);

    int updateByPrimaryKeySelective(PrUser record);

    int updateByPrimaryKey(PrUser record);
}