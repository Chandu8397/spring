package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

/*
* Author: Mekapothula.Reddy
* Date: 21 Nov 2024
* Time:12:32:52 pm
* Project:spring-web
*/
@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@GetMapping("/bye")
	public String showLoginForm1() {
		return "signin";
	}
	
	@PostMapping("/process")
	public String checkUser(HttpServletRequest req, Model m)
	{
		String uname=req.getParameter("uname");
		String password=req.getParameter("psw");
		
		 if(password.equals("testing"))
		 {
			 String msg="Welcome "+uname;
			 m.addAttribute("message", msg);
			 return "success";
		 }
		 else
		 {
			 String msg="Sorry "+uname+". You entered Incorrect Password.";
			 m.addAttribute("message", msg);
			 return "errorPage";
		 }
	
		
	}

}
