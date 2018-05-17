package cn.clt.core.mapper;

import cn.clt.core.entity.UserExchangeBalanceFlow;
import cn.clt.core.entity.UserExchangeBalanceFlowExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserExchangeBalanceFlowMapper {
    long countByExample(UserExchangeBalanceFlowExample example);

    int deleteByExample(UserExchangeBalanceFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserExchangeBalanceFlow record);

    int insertSelective(UserExchangeBalanceFlow record);

    List<UserExchangeBalanceFlow> selectByExample(UserExchangeBalanceFlowExample example);

    UserExchangeBalanceFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserExchangeBalanceFlow record, @Param("example") UserExchangeBalanceFlowExample example);

    int updateByExample(@Param("record") UserExchangeBalanceFlow record, @Param("example") UserExchangeBalanceFlowExample example);

    int updateByPrimaryKeySelective(UserExchangeBalanceFlow record);

    int updateByPrimaryKey(UserExchangeBalanceFlow record);
}