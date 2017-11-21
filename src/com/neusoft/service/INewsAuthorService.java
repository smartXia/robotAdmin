package com.neusoft.service;

import java.util.List;

import com.neusoft.po.NewsAuthor;

public interface INewsAuthorService {
	/***
	 * 查出所有的新闻作者
	 * 
	 * @return
	 */
	public List<NewsAuthor> findauhtorList();

	public int newsAuthorDel(NewsAuthor newsAuthor);

	public int updateByPrimaryKey(NewsAuthor newsAuthor);

	public int newsAuthorAdd(NewsAuthor newsAuthor);
}
