package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.Orderdetails;
import com.neusoft.po.Orders;
import com.neusoft.po.Users;
import com.neusoft.service.IOrderDeatil;
import com.neusoft.service.IOrderService;
import com.neusoft.service.IUserService;
import com.neusoft.service.impl.UserServiceImpl;
import com.sun.org.apache.regexp.internal.recompile;

@Controller
@RequestMapping("/order")
public class OrderControl {
	@Autowired
	IOrderDeatil deatil;
	@Autowired
	IUserService iUserService;
	@Autowired
	IOrderService iOrderService;

	@RequestMapping("orderList")
	public String orderList(Model model, HttpSession session, Integer pageNo) {
		int pageNums;// 第几页
		int allcount = deatil.allcount();// 数据库中的有效数据
		if (allcount % 5 == 0) {
			pageNums = allcount / 5;
		} else {
			pageNums = allcount / 5 + 1;// 下一页加1

		}
		// 将值传到前台
		session.setAttribute("pageNums", pageNums);
		if (pageNo != null) {
			List<Orderdetails> orderList = deatil
					.orderdetails((pageNo - 1) * 5);
			session.setAttribute("orderList", orderList);
			session.setAttribute("pageNo", pageNo);
		} else {
			List<Orderdetails> orderList = deatil.orderdetails(0);
			session.setAttribute("orderList", orderList);
			session.setAttribute("pageNo", 1);
		}
		return "order/orderlist";

	}

	@RequestMapping("finddetail")
	public String finddetail(Long detailId, String userName, Model model) {

		System.out.println("打印前台的数据" + detailId + userName);
		List<Orders> orders = iOrderService.orderdetail(detailId);
		List<Users> users = iUserService.selectByName(userName);

		model.addAttribute("orders", orders);

		model.addAttribute("users", users);
		return "order/orderDeatil";

	}

	@RequestMapping("fahuo")
	public String fahuo(Long water, Model model, HttpSession session,
			Integer pageNo) {

		System.out.println("发货成功" + water);
		deatil.update(water);
		iOrderService.update(water);
		return this.orderList(model, session, pageNo);

	}
}
