package com.neusoft.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.neusoft.po.NewsInfo;
import com.neusoft.po.NewsInfoExample;

public interface INewsInfoService {
	/*
	 * 直接查询info表
	 */
	public List<NewsInfo> newsInfoList(int startRow);

	/*
	 * 多表一对一查询
	 */
	public List<NewsInfo> newsInfodetailList();

	/*
	 * 根据id删除
	 */
	public void deleteByExample(NewsInfoExample newsInfoExample);

	/*
	 * 根据对象查找更新新闻
	 */
	public NewsInfo findNewsByone(int newsId);

	/*
	 * 新增新闻
	 */
	public int insertNewsInfo(NewsInfo newsInfo);

	/**
	 * 更新新闻
	 */
	public int updateNewsInfo(NewsInfo newsInfo);
	/*
	 * 查找总数
	 */
	public int allcount();

}
