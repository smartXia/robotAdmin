package com.neusoft.mapper;

import com.neusoft.po.NewsInfo;
import com.neusoft.po.NewsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsInfoMapper {
    int countByExample(NewsInfoExample example);

    int deleteByExample(NewsInfoExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsInfo record);

    int insertSelective(NewsInfo record);

    List<NewsInfo> selectByExample(NewsInfoExample example);

    NewsInfo selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    int updateByExample(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    int updateByPrimaryKeySelective(NewsInfo record);

    int updateByPrimaryKey(NewsInfo record);
	// 自定义方法
	public List<NewsInfo> showNewsinfodetailList();

}