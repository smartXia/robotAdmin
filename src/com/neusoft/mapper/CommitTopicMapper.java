package com.neusoft.mapper;

import com.neusoft.po.CommitTopic;
import com.neusoft.po.CommitTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommitTopicMapper {
    int countByExample(CommitTopicExample example);

    int deleteByExample(CommitTopicExample example);

    int deleteByPrimaryKey(Integer commitId);

    int insert(CommitTopic record);

    int insertSelective(CommitTopic record);

    List<CommitTopic> selectByExample(CommitTopicExample example);

    CommitTopic selectByPrimaryKey(Integer commitId);

    int updateByExampleSelective(@Param("record") CommitTopic record, @Param("example") CommitTopicExample example);

    int updateByExample(@Param("record") CommitTopic record, @Param("example") CommitTopicExample example);

    int updateByPrimaryKeySelective(CommitTopic record);

    int updateByPrimaryKey(CommitTopic record);
}