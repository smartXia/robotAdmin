package com.neusoft.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.RobotCompany;
import com.neusoft.service.IRobotCompanyService;

@Controller
@RequestMapping("/robotcom")
public class RobotCompanyControl {
	@Autowired
	IRobotCompanyService iRobotCompanyService;

	/**
	 * 商品机器人种类的list
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("showRobotComList")
	public String showRobotComList(Model model) {
		List<RobotCompany> showRobotComList = iRobotCompanyService
				.robotCompanyList();

		model.addAttribute("showRobotComList", showRobotComList);
		return "robot/manageRobotCom";
	}

	/**
	 * 添加种类
	 * 
	 * @param model
	 * @param robotType
	 * @return
	 */
	@RequestMapping("addComType")
	public String addComType(Model model, RobotCompany robotCompany) {
		iRobotCompanyService.addRobotCompany(robotCompany);
		return this.showRobotComList(model);
	}

	@RequestMapping("delRobotCom")
	public String delRobotCom(Model model, RobotCompany robotCompany) {
		System.out.println(robotCompany.getCompanyName());
		iRobotCompanyService.delrobotCompany(robotCompany);
		return this.showRobotComList(model);
	}

	@RequestMapping("updateComName")
	public String updateComType(Model model, RobotCompany robotCompany) {
		System.out.println(robotCompany.getCompanyName());
		iRobotCompanyService.updaterobotCompany(robotCompany);
		return this.showRobotComList(model);
	}

}
