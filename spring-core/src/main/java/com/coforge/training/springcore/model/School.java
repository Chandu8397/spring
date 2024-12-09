package com.coforge.training.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:39:48 pm
* Project:spring-core
*/
@Component
public class School {
	
	private int schoolId;
	private String schoolName;
	private Pupil pupil;     //has Realtionship
	
	
	@Autowired  //Injecting pupil object Automatically
	public School(Pupil pupil) {
		super();
		this.schoolId = 111;
		this.schoolName = "GreenWood High School";
		this.pupil = pupil;
	}
	
	public void display() {
		System.out.println("***** School Details ******");
		System.out.println(this.schoolId+" "+this.schoolName);
		System.out.println("Pupil Details: "+pupil);
	}	
}
