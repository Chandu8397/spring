package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.Employee;
import com.coforge.training.springweb.model.Reservation;

/*
* Author: Mekapothula.Reddy
* Date: 21 Nov 2024
* Time:3:15:38 pm
* Project:spring-web
*/
@Controller
public class EmployeeController {
	
	@GetMapping("/employee")
	public String employeeForm(Model theModel) {
		Employee e= new Employee();
		theModel.addAttribute("emp", e);
		return "employee";
		}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("emp") Employee e) {
		return "viewEmployee";
		
	}	

}
