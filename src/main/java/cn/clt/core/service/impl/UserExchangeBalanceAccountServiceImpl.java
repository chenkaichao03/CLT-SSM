package cn.clt.core.service.impl;

import cn.clt.core.entity.UserExchangeBalanceAccount;
import cn.clt.core.entity.UserExchangeBalanceAccountExample;
import cn.clt.core.mapper.UserExchangeBalanceAccountMapper;
import cn.clt.core.service.UserExchangeBalanceAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Description UserExchangeBalanceAccountServiceImpl
 * @Aouthor CLT
 * @Date 2018/05/22 10:14
 */
@Service
public class UserExchangeBalanceAccountServiceImpl implements UserExchangeBalanceAccountService {

    private static final Logger logger = LoggerFactory.getLogger(UserExchangeBalanceAccountServiceImpl.class);
    @Autowired
    private UserExchangeBalanceAccountMapper userExchangeBalanceAccountMapper;

    /**
     * @Title getUserExchangeBalanceAccount
     * @Description 获取账户余额表
     * @Author CLT
     * @Date 2018/5/22 10:16
     * @param userId
     * @return
     */
    @Override
    public UserExchangeBalanceAccount getUserExchangeBalanceAccount(String userId) {
        UserExchangeBalanceAccountExample example = new UserExchangeBalanceAccountExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(1);
        List<UserExchangeBalanceAccount> userExchangeBalanceAccountList = userExchangeBalanceAccountMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userExchangeBalanceAccountList)){
            return userExchangeBalanceAccountList.get(0);
        }
        return null;
    }

    /**
     * @Title updateUserExchangeBalanceAccount
     * @Description 更新账户余额
     * @Author CLT
     * @Date 2018/5/22 10:52
     * @param userExchangeBalanceAccount
     * @return
     */
    @Override
    public int updateUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount) {
        return userExchangeBalanceAccountMapper.updateByPrimaryKeySelective(userExchangeBalanceAccount);
    }

    /**
     * @Title insertUserExchangeBalanceAccount
     * @Description 新增账户余额
     * @Author CLT
     * @Date 2018/5/22 11:16
     * @param userExchangeBalanceAccount
     */
    @Override
    public void insertUserExchangeBalanceAccount(UserExchangeBalanceAccount userExchangeBalanceAccount) {
        userExchangeBalanceAccountMapper.insert(userExchangeBalanceAccount);
    }
}
