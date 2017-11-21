package com.neusoft.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.po.RobotType;
import com.neusoft.service.IRobotTypeService;

@Controller
@RequestMapping("/robottype")
public class RobotTypeControl {
	@Autowired
	IRobotTypeService iRobotTypeService;

	/**
	 * 商品机器人种类的list
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("showRobotTypeList")
	public String showRobotTypeList(Model model) {

		List<RobotType> robotTypeList = iRobotTypeService.RobotTypeList();
		model.addAttribute("robotTypeList", robotTypeList);
		return "robot/manageRobotType";
	}

	/**
	 * 添加种类
	 * 
	 * @param model
	 * @param robotType
	 * @return
	 */
	@RequestMapping("addRobotType")
	public String addRobotType(Model model, RobotType robotType) {
		iRobotTypeService.addRobotType(robotType);
		return this.showRobotTypeList(model);
	}

	@RequestMapping("delRobotType")
	public String delRobotType(Model model, RobotType robotType) {
		System.out.println(robotType.getTypeName());
		iRobotTypeService.delRobotType(robotType);
		return this.showRobotTypeList(model);
	}

	@RequestMapping("updateRobotType")
	public String updateRobotType(Model model, RobotType robotType) {
		System.out.println(robotType.getTypeName());
		iRobotTypeService.updateRobotType(robotType);
		return this.showRobotTypeList(model);
	}

}
