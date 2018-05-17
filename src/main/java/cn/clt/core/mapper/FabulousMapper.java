package cn.clt.core.mapper;

import cn.clt.core.entity.Fabulous;
import cn.clt.core.entity.FabulousExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FabulousMapper {
    long countByExample(FabulousExample example);

    int deleteByExample(FabulousExample example);

    int deleteByPrimaryKey(String id);

    int insert(Fabulous record);

    int insertSelective(Fabulous record);

    List<Fabulous> selectByExample(FabulousExample example);

    Fabulous selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Fabulous record, @Param("example") FabulousExample example);

    int updateByExample(@Param("record") Fabulous record, @Param("example") FabulousExample example);

    int updateByPrimaryKeySelective(Fabulous record);

    int updateByPrimaryKey(Fabulous record);
}