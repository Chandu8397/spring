package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 19 Nov 2024
* Time:5:13:31 pm
* Project:spring-core
* 
* Spring uses POJO based programming Model
* Constructor Dependancy Injection using XML configuration
* 
*/

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("***** Employee Details ******");
		System.out.println(this.empId+" "+this.name+" "+this.salary);
	}
	
}
