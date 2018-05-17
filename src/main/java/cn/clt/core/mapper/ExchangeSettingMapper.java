package cn.clt.core.mapper;

import cn.clt.core.entity.ExchangeSetting;
import cn.clt.core.entity.ExchangeSettingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExchangeSettingMapper {
    long countByExample(ExchangeSettingExample example);

    int deleteByExample(ExchangeSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExchangeSetting record);

    int insertSelective(ExchangeSetting record);

    List<ExchangeSetting> selectByExample(ExchangeSettingExample example);

    ExchangeSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExchangeSetting record, @Param("example") ExchangeSettingExample example);

    int updateByExample(@Param("record") ExchangeSetting record, @Param("example") ExchangeSettingExample example);

    int updateByPrimaryKeySelective(ExchangeSetting record);

    int updateByPrimaryKey(ExchangeSetting record);
}