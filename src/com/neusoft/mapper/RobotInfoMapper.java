package com.neusoft.mapper;

import com.neusoft.po.RobotInfo;
import com.neusoft.po.RobotInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotInfoMapper {
    int countByExample(RobotInfoExample example);

    int deleteByExample(RobotInfoExample example);

    int deleteByPrimaryKey(Integer robotId);

    int insert(RobotInfo record);

    int insertSelective(RobotInfo record);

    List<RobotInfo> selectByExample(RobotInfoExample example);

    RobotInfo selectByPrimaryKey(Integer robotId);

    int updateByExampleSelective(@Param("record") RobotInfo record, @Param("example") RobotInfoExample example);

    int updateByExample(@Param("record") RobotInfo record, @Param("example") RobotInfoExample example);

    int updateByPrimaryKeySelective(RobotInfo record);

    int updateByPrimaryKey(RobotInfo record);
}