package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:4:08:09 pm
* Project:spring-web
*/

@Controller
public class HelloWorldController {
	
	@RequestMapping("/Chandu")            //Mapping Name(Chandu)
	public String sayHello() {
		return "hello";		//return view
	}
	
	/* work flow of a Spring MVC Application
	 * Client --> Request(index.jsp) -->FrontController(web.xml)
	 * -->Controller(HelloWorldController)--->response(hello.jsp)
	 * 
	 */
	
	

}
