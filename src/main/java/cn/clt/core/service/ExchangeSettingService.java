package cn.clt.core.service;

import cn.clt.core.entity.ExchangeSetting;
import cn.clt.core.entity.User;
import cn.clt.core.entity.UserExchange;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.vo.UserProfitVO;

import java.util.List;

/**
 * @Description ExchangeSettingService
 * @Aouthor CLT
 * @Date 2018/05/09 17:37
 */
public interface ExchangeSettingService {

    /**
     * @Title exchangeSetting
     * @Description 兑换设置
     * @Author CLT
     * @Date 2018/5/9 17:47
     * @param exchangeSetting
     * @return
     */
    String exchangeSetting(ExchangeSetting exchangeSetting);

    /**
     * @Title listExchangeSetting
     * @Description
     * @Author CLT
     * @Date 2018/5/9 18:12
     * @param role
     * @return
     */
    List<ExchangeSetting> listExchangeSetting(String role);

    /**
     * @Title selectPageUserExchange
     * @Description 获取用户兑换列表
     * @Author CLT
     * @Date 2018/5/10 14:07
     * @param userId
     * @param exchangeType
     * @param pageNo
     * @param pageSize
     * @return
     */
    ManagementPageData selectPageUserExchange(String userId, String exchangeType, Integer pageNo, Integer pageSize);

    /**
     * @Title getUserProfit
     * @Description 用户累计收益汇总
     * @Author CLT
     * @Date 2018/5/10 14:56
     * @param userExchangeList
     * @return
     */
    UserProfitVO getUserProfit(List<UserExchange> userExchangeList);

    /**
     * @Title getExchangeSettingById
     * @Description 通过id获取兑换设置
     * @Author CLT
     * @Date 2018/5/11 16:21
     * @param id
     * @return
     */
    ExchangeSetting getExchangeSettingById(String id);
}
