package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.FeedbackMapper;
import com.neusoft.po.Feedback;
import com.neusoft.po.FeedbackExample;
import com.neusoft.service.IFeedBackService;

@Service
public class FeedBackImpl implements IFeedBackService {
	@Autowired
	FeedbackMapper feedbackMapper;

	@Override
	public List<Feedback> showFeedBcakList(int startRow) {
		FeedbackExample example = new FeedbackExample();
		example.setPageSize(4);
		example.setStartRow(startRow);
		List<Feedback> feedbackList = feedbackMapper.selectByExample(example);
		return feedbackList;
	}

	@Override
	public int addFeedBack(Feedback feedback) {

		return feedbackMapper.insert(feedback);
	}

	@Override
	public int delFeedBack(Feedback feedback) {

		int id = feedback.getId();
		return feedbackMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 数据库中存在的总条数
	 */
	@Override
	public int allcount() {
		FeedbackExample example = new FeedbackExample();
		return feedbackMapper.countByExample(example);
	}

}
