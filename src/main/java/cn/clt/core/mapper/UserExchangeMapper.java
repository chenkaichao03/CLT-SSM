package cn.clt.core.mapper;

import cn.clt.core.entity.UserExchange;
import cn.clt.core.entity.UserExchangeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserExchangeMapper {
    long countByExample(UserExchangeExample example);

    int deleteByExample(UserExchangeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserExchange record);

    int insertSelective(UserExchange record);

    List<UserExchange> selectByExample(UserExchangeExample example);

    UserExchange selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserExchange record, @Param("example") UserExchangeExample example);

    int updateByExample(@Param("record") UserExchange record, @Param("example") UserExchangeExample example);

    int updateByPrimaryKeySelective(UserExchange record);

    int updateByPrimaryKey(UserExchange record);

    List<UserExchange> listUserExchange(Map<String,Object> params);

    Long countUserExchange(Map<String,Object> params);
}