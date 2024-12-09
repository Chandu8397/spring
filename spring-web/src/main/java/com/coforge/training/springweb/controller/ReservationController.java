package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.Reservation;

/*
* Author: Mekapothula.Reddy
* Date: 21 Nov 2024
* Time:2:25:00 pm
* Project:spring-web
*/
@Controller
public class ReservationController {
	
	@GetMapping("/reservation")
	public String bookingForm(Model theModel) {
		Reservation res = new Reservation();
		theModel.addAttribute("reserve", res);
		return "reservation";
	} 
	
	@PostMapping("/submitForm")
	public String submitForm(@ModelAttribute("reserve") Reservation res) {
		return "confirmationForm";
	}

}
