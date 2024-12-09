package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:5:14:33 pm
* Project:spring-web
*/
@Controller
public class CoforgeController {
	
	@RequestMapping("/Chandrashekhar")
	public String sayHello() {
		return "coforge";		//return view
	}

}
