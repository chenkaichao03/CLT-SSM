package cn.clt.core.mapper;

import cn.clt.core.entity.Concern;
import cn.clt.core.entity.ConcernExample;
import java.util.List;
import java.util.Map;

import cn.clt.core.vo.ConcernVO;
import cn.clt.core.vo.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConcernMapper {
    long countByExample(ConcernExample example);

    int deleteByExample(ConcernExample example);

    int deleteByPrimaryKey(String id);

    int insert(Concern record);

    int insertSelective(Concern record);

    List<Concern> selectByExample(ConcernExample example);

    Concern selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Concern record, @Param("example") ConcernExample example);

    int updateByExample(@Param("record") Concern record, @Param("example") ConcernExample example);

    int updateByPrimaryKeySelective(Concern record);

    int updateByPrimaryKey(Concern record);

    List<UserInfoVO> listFans(Map<String,Object> params);

    Long countFans(Map<String,Object> params);

    List<UserInfoVO> listConcern(Map<String,Object> params);

    Long countConcern(Map<String,Object> params);
}