package com.neusoft.control;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Admin;
import com.neusoft.service.IAdminService;

@Controller
@RequestMapping("/admin")
public class AdminControl {
	@Autowired
	IAdminService iAdminService;

	// 这个是验证登录的方法返回的是对象
	@RequestMapping(value = "loginbyadmin", method = RequestMethod.POST)
	public @ResponseBody
	Admin loginbyadmin(Admin admin, HttpServletResponse response, Model model) {
		System.out.println(admin.getAdminName());
		System.out.println(admin.getAdminPwd());
		System.out.println("进入判断");
		System.out.println(iAdminService.loginbyadmin(admin));
		admin = iAdminService.loginbyadmin(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return admin;// 返回的是一个对象
	}

	// 这个是在展示所有的管理员信息的
	/*
	 * @RequestMapping("adminInfoList") public String adminInfoList(Admin admin,
	 * Model model) { System.out.println(admin.getAdminName()); List<Admin>
	 * adminList = iAdminService.adminInfo(admin); model.addAttribute("admin",
	 * admin); System.out.println(admin); return "index01"; }
	 */
	/**
	 * 这个是展示单独登录的信息在localhref:中调用 返回的结果是index界面
	 * 
	 * @param admin
	 * @param model
	 * @return
	 */
	@RequestMapping("adminInfo")
	public String adminInfo(Admin admin, Model model) {
		System.out.println("进入header的方法中" + admin.getAdminId());
		admin = iAdminService.admininfo(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return "index";
	}

	// 这是将header默认动态显示出来
	@RequestMapping("adminInfoHeader")
	public String adminInfoHeader(Admin admin, Model model) {
		System.out.println("进入header的方法中" + admin.getAdminId());
		admin = iAdminService.admininfo(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return "header";
	}

	// 这是将menu动态显示出来

	/*
	 * 
	 */
	@RequestMapping("adminUpdate")
	public String adminUpdate(Admin admin, Model model) {
		System.out.println("进入header的方法中" + admin.getAdminId());
		admin = iAdminService.admininfo(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return "adminUpdate";
	}

	@RequestMapping("adminUpdateAfter")
	public String adminUpdateAfter(Admin admin, Model model) {
		System.out.println("修改的参数为:" + admin.getAdminId());
		iAdminService.updateByPrimaryKeySelective(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return "success";
	}

	@RequestMapping("adminInfoMenu")
	public String adminInfoMenu(Admin admin, Model model) {
		System.out.println("进入menu的方法中" + admin.getAdminId());
		admin = iAdminService.admininfo(admin);
		model.addAttribute("admin", admin);
		System.out.println(admin);
		return "menu";
	}
}
