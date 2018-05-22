package cn.clt.core.mapper;

import cn.clt.core.entity.UserExchangeBalanceAccount;
import cn.clt.core.entity.UserExchangeBalanceAccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserExchangeBalanceAccountMapper {
    long countByExample(UserExchangeBalanceAccountExample example);

    int deleteByExample(UserExchangeBalanceAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserExchangeBalanceAccount record);

    int insertSelective(UserExchangeBalanceAccount record);

    List<UserExchangeBalanceAccount> selectByExample(UserExchangeBalanceAccountExample example);

    UserExchangeBalanceAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserExchangeBalanceAccount record, @Param("example") UserExchangeBalanceAccountExample example);

    int updateByExample(@Param("record") UserExchangeBalanceAccount record, @Param("example") UserExchangeBalanceAccountExample example);

    int updateByPrimaryKeySelective(UserExchangeBalanceAccount record);

    int updateByPrimaryKey(UserExchangeBalanceAccount record);
}