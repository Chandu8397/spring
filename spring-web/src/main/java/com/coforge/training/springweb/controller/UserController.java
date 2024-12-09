package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * Author: Mekapothula.Reddy
 * Date: 21 Nov 2024
 * Time:11:42:48 am
 * Project:spring-web
 */
@Controller
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userInfo(ModelMap model) {		//ModelMap is container to hold data with key/values representation
		model.addAttribute("user", "Chandu");
		model.addAttribute("d", new java.util.Date());
		return "user";    //return model+views
	}

	@RequestMapping("/spring")
	public String showSecond() {
		return "second";   //returns view 
	}

}
