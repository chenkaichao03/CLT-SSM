package cn.clt.core.service;

import cn.clt.core.entity.AccessStatistics;
import cn.clt.core.vo.AccessStatisticeVO;

import java.util.List;
import java.util.Vector;

/**
 * @Description 用户浏览信息
 * @Aouthor CLT
 * @Date 2018/05/14 10:21
 */
public interface AccessStatisticsService {

    /**
     * @Title listAccessStatistics
     * @Description 获取文章的访问量
     * @Author CLT
     * @Date 2018/5/14 10:32
     * @return
     */
    List<AccessStatisticeVO> listAccessStatistics();

    /**
     * @Title visitIps
     * @Description 获取所有的ip地址
     * @Author CLT
     * @Date 2018/5/14 11:16
     * @return
     */
    Vector<String> visitIps();

    /**
     * @Title getAccessStatisticsByArticleIdAndIp
     * @Description 获取浏览量访问记录
     * @Author CLT
     * @Date 2018/5/18 18:21
     * @param articleId
     * @param visitIp
     * @return
     */
    AccessStatistics getAccessStatisticsByArticleIdAndIp(String articleId, String visitIp);

    /**
     * @Title updateAccessStatistics
     * @Description 更行浏览访问记录
     * @Author CLT
     * @Date 2018/5/18 23:51
     * @param accessStatistics
     * @return
     */
    int updateAccessStatistics(AccessStatistics accessStatistics);

    /**
     * @Title insertAccessStatistics
     * @Description 新增浏览访问记录
     * @Author CLT
     * @Date 2018/5/19 0:06
     * @param accessStatistics
     */
    void insertAccessStatistics(AccessStatistics accessStatistics);
}
