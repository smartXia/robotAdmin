package com.neusoft.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neusoft.mapper.NewsInfoMapper;
import com.neusoft.po.NewsInfo;
import com.neusoft.po.NewsInfoExample;
import com.neusoft.service.INewsInfoService;

@Service
public class NewsInfoImpl implements INewsInfoService {
	@Autowired
	NewsInfoMapper newsinfoMapper;

	public List<NewsInfo> newsInfoList(int startRow) {
		NewsInfoExample example = new NewsInfoExample();
		example.setPageSize(4);
		example.setStartRow(startRow);
		example.setOrderByClause("news_id desc");
		List<NewsInfo> newsinfoList = newsinfoMapper.selectByExample(example);
		return newsinfoList;
	}

	public List<NewsInfo> newsInfodetailList() {
		System.out.println("进入service");
		return newsinfoMapper.showNewsinfodetailList();
	}

	public void deleteByExample(NewsInfoExample newsInfoExample) {
		System.out.println("进入service");
		newsinfoMapper.deleteByExample(newsInfoExample);

	}

	public NewsInfo findNewsByone(int newsId) {
		System.out.println("进入service");

		return newsinfoMapper.selectByPrimaryKey(newsId);
	}

	public int updateNewsInfo(NewsInfo newsInfo) {
		// TODO Auto-generated method stub
		return newsinfoMapper.updateByPrimaryKey(newsInfo);
	}

	public int insertNewsInfo(NewsInfo newsInfo) {

		return newsinfoMapper.insert(newsInfo);
	}

	@Override
	public int allcount() {
		NewsInfoExample example = new NewsInfoExample();
		return newsinfoMapper.countByExample(example);
	}

}
