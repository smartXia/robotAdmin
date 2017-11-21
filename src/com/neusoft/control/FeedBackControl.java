package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.Feedback;
import com.neusoft.service.IFeedBackService;

@Controller
public class FeedBackControl {
	@Autowired
	IFeedBackService iFeedBackService;

	@RequestMapping("feedbacklist")
	public String showFeedback(Feedback feedback, HttpSession session,
			Integer pageNo) {

		int pageNums;// 页码最大值
		int newsNums = iFeedBackService.allcount();// 数据库中有效条目数
		if (newsNums % 4 == 0) {
			pageNums = newsNums / 4;
		} else {
			pageNums = newsNums / 4 + 1;
		}
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<Feedback> feedBackList = iFeedBackService
					.showFeedBcakList((pageNo - 1) * 4);
			session.setAttribute("feedBackList", feedBackList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<Feedback> feedBackList = iFeedBackService.showFeedBcakList(0);
			session.setAttribute("feedBackList", feedBackList);
			session.setAttribute("pageNo", 1);// 页码默认是从一开始的。
		}
		return "feedback/feedBack";

	}

	@RequestMapping("addfeedback")
	public String addfeedback(Feedback feedback, HttpSession session,
			Integer pageNo) {
		System.out.println(feedback.getAnswer());
		System.out.println(feedback.getQuestion());
		iFeedBackService.addFeedBack(feedback);

		return this.showFeedback(feedback, session, pageNo);

	}

	@RequestMapping("delfeedback")
	public String delfeedback(Feedback feedback, HttpSession session,
			Integer pageNo) {
		System.out.println(feedback.getAnswer());
		System.out.println(feedback.getQuestion());
		iFeedBackService.delFeedBack(feedback);

		return this.showFeedback(feedback, session, pageNo);

	}
}
