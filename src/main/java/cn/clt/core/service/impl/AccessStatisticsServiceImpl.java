package cn.clt.core.service.impl;

import cn.clt.core.mapper.AccessStatisticsMapper;
import cn.clt.core.service.AccessStatisticsService;
import cn.clt.core.vo.AccessStatisticeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Vector;

/**
 * @Description 用户浏览信息
 * @Aouthor CLT
 * @Date 2018/05/14 10:22
 */
@Service
public class AccessStatisticsServiceImpl implements AccessStatisticsService{

    private static final Logger logger = LoggerFactory.getLogger(AccessStatisticsServiceImpl.class);
    @Autowired
    private AccessStatisticsMapper accessStatisticsMapper;

    /**
     * @Title listAccessStatistics
     * @Description 获取文章的访问量
     * @Author CLT
     * @Date 2018/5/14 10:32
     * @return
     */
    @Override
    public List<AccessStatisticeVO> listAccessStatistics() {
        List<AccessStatisticeVO> accessStatisticeList = accessStatisticsMapper.listAccessStatistics();
        if (!CollectionUtils.isEmpty(accessStatisticeList)){
            return accessStatisticeList;
        }
        return null;
    }

    /**
     * @Title visitIps
     * @Description 获取所有的ip地址
     * @Author CLT
     * @Date 2018/5/14 11:16
     * @return
     */
    @Override
    public Vector<String> visitIps() {
        Vector<String> vector = new Vector<>();
        List<AccessStatisticeVO> visitIps = accessStatisticsMapper.visitIps();
        if (!CollectionUtils.isEmpty(visitIps)){
            for (AccessStatisticeVO accessStatisticeVO : visitIps){
                vector.add(accessStatisticeVO.getVisitIp());
            }
        }
        return vector;
    }
}
