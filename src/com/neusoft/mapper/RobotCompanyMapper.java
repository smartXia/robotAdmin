package com.neusoft.mapper;

import com.neusoft.po.RobotCompany;
import com.neusoft.po.RobotCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotCompanyMapper {
    int countByExample(RobotCompanyExample example);

    int deleteByExample(RobotCompanyExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(RobotCompany record);

    int insertSelective(RobotCompany record);

    List<RobotCompany> selectByExample(RobotCompanyExample example);

    RobotCompany selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") RobotCompany record, @Param("example") RobotCompanyExample example);

    int updateByExample(@Param("record") RobotCompany record, @Param("example") RobotCompanyExample example);

    int updateByPrimaryKeySelective(RobotCompany record);

    int updateByPrimaryKey(RobotCompany record);
}