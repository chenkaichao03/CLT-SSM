package cn.clt.core.mapper;

import cn.clt.core.entity.AccessStatistics;
import cn.clt.core.entity.AccessStatisticsExample;
import java.util.List;

import cn.clt.core.vo.AccessStatisticeVO;
import org.apache.ibatis.annotations.Param;

public interface AccessStatisticsMapper {
    long countByExample(AccessStatisticsExample example);

    int deleteByExample(AccessStatisticsExample example);

    int deleteByPrimaryKey(byte[] id);

    int insert(AccessStatistics record);

    int insertSelective(AccessStatistics record);

    List<AccessStatistics> selectByExample(AccessStatisticsExample example);

    AccessStatistics selectByPrimaryKey(byte[] id);

    int updateByExampleSelective(@Param("record") AccessStatistics record, @Param("example") AccessStatisticsExample example);

    int updateByExample(@Param("record") AccessStatistics record, @Param("example") AccessStatisticsExample example);

    int updateByPrimaryKeySelective(AccessStatistics record);

    int updateByPrimaryKey(AccessStatistics record);

    List<AccessStatisticeVO> listAccessStatistics();

    List<AccessStatisticeVO> visitIps();
}