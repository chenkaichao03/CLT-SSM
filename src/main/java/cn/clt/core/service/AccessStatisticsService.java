package cn.clt.core.service;

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
}
