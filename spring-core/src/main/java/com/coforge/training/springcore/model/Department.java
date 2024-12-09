package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:42:03 pm
* Project:spring-core
*/

public class Department {

	private String name;

	public Department(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
	
}
