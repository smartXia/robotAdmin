package com.neusoft.mapper;

import com.neusoft.po.RobotType;
import com.neusoft.po.RobotTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotTypeMapper {
    int countByExample(RobotTypeExample example);

    int deleteByExample(RobotTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(RobotType record);

    int insertSelective(RobotType record);

    List<RobotType> selectByExample(RobotTypeExample example);

    RobotType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") RobotType record, @Param("example") RobotTypeExample example);

    int updateByExample(@Param("record") RobotType record, @Param("example") RobotTypeExample example);

    int updateByPrimaryKeySelective(RobotType record);

    int updateByPrimaryKey(RobotType record);
}