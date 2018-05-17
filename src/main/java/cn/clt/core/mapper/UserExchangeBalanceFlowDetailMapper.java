package cn.clt.core.mapper;

import cn.clt.core.entity.UserExchangeBalanceFlowDetail;
import cn.clt.core.entity.UserExchangeBalanceFlowDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserExchangeBalanceFlowDetailMapper {
    long countByExample(UserExchangeBalanceFlowDetailExample example);

    int deleteByExample(UserExchangeBalanceFlowDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserExchangeBalanceFlowDetail record);

    int insertSelective(UserExchangeBalanceFlowDetail record);

    List<UserExchangeBalanceFlowDetail> selectByExample(UserExchangeBalanceFlowDetailExample example);

    UserExchangeBalanceFlowDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserExchangeBalanceFlowDetail record, @Param("example") UserExchangeBalanceFlowDetailExample example);

    int updateByExample(@Param("record") UserExchangeBalanceFlowDetail record, @Param("example") UserExchangeBalanceFlowDetailExample example);

    int updateByPrimaryKeySelective(UserExchangeBalanceFlowDetail record);

    int updateByPrimaryKey(UserExchangeBalanceFlowDetail record);
}