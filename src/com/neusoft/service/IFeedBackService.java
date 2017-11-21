package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Feedback;

public interface IFeedBackService {
	/**
	 * 展示其中的反馈内容
	 * 
	 * @return
	 */
	public List<Feedback> showFeedBcakList(int startRow);
	public int allcount();
	public int addFeedBack(Feedback feedback);

	public int delFeedBack(Feedback feedback);
}
