package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.Users;
import com.neusoft.service.IUserService;

@Controller
@RequestMapping("/userinfo")
public class UserInfoControl {
	@Autowired
	IUserService userService;

	@RequestMapping("/userInfoList")
	public String userInfoList(Model model, HttpSession session, Integer pageNo) {
		int pageNums;// 页码最大值
		int newsNums = userService.allcount();
		if (newsNums % 5 == 0) {
			pageNums = newsNums / 5;
		} else {
			pageNums = newsNums / 5 + 1;
		}
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<Users> userInfoList = userService
					.userInfoList((pageNo - 1) * 5);
			session.setAttribute("userInfoList", userInfoList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<Users> userInfoList = userService.userInfoList(0);
			session.setAttribute("userInfoList", userInfoList);
			session.setAttribute("pageNo", 1);
		}

		// model.addAttribute("userInfoList", userInfoList);
		return "user/manageUserInfo";
	}

	// 加了一个HttpServletRequest request
	@RequestMapping("/userInfoDel")
	public String userInfoDel(Users user, HttpServletRequest request,
			Model model, HttpSession session, Integer pageNo) {

		System.out.println("删除的编号为：" + user.getUserId());
		userService.delUserInfo(user);
		return this.userInfoList(model, session, pageNo);
	}

	@RequestMapping("/userInfoUpdate")
	public String userInfoUpdate(Users user, HttpServletRequest request,
			Model model) {
		System.out.println("更新的用户为：" + user.getUserId());
		user = userService.selectById(user);
		model.addAttribute("user", user);
		return "user/userInfoUpdate";
	}

	@RequestMapping("/userInfoUpdateMoney")
	public String userInfoUpdateMoney(Users user, HttpServletRequest request,
			Model model, HttpSession session, Integer pageNo) {
		System.out.println("更新的用户为：" + user.getUserId());
		userService.updateUserInfo(user);
		return this.userInfoList(model, session, pageNo);
	}

	@RequestMapping("/upload")
	public String upload(Users user, HttpServletRequest request, Model model)
			throws Exception {
		// System.out.println(request.getParameter("name"));

		userService.addUserInfo(user);
		model.addAttribute("user", user);
		return "user/MyJsp";
	}
}
