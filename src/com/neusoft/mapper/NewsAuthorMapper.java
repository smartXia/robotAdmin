package com.neusoft.mapper;

import com.neusoft.po.NewsAuthor;
import com.neusoft.po.NewsAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsAuthorMapper {
    int countByExample(NewsAuthorExample example);

    int deleteByExample(NewsAuthorExample example);

    int deleteByPrimaryKey(Integer authorId);

    int insert(NewsAuthor record);

    int insertSelective(NewsAuthor record);

    List<NewsAuthor> selectByExample(NewsAuthorExample example);

    NewsAuthor selectByPrimaryKey(Integer authorId);

    int updateByExampleSelective(@Param("record") NewsAuthor record, @Param("example") NewsAuthorExample example);

    int updateByExample(@Param("record") NewsAuthor record, @Param("example") NewsAuthorExample example);

    int updateByPrimaryKeySelective(NewsAuthor record);

    int updateByPrimaryKey(NewsAuthor record);
}