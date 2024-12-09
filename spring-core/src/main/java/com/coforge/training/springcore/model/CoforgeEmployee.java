package com.coforge.training.springcore.model;

/*
 * Author: Mekapothula.Reddy
 * Date: 20 Nov 2024
 * Time:2:41:41 pm
 * Project:spring-core
 */

/*
 * Example of using Spring Core Dependency Injection (DI) with an CoforgeEmployee class. 
 * This example will demonstrate how to inject dependencies into the CoforgeEmployee class, 
 * such as a Department and an MyAddress using Java Configuration.
 */

//Class with MyAddress & Department has Dependent Objects
public class CoforgeEmployee {

	private int empId;
	private String name;
	private MyAddress address; 
	private Department department;

	public CoforgeEmployee(int empId, String name, MyAddress address, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Id     : "+empId);
		System.out.println("Employee Name   : "+name);
		System.out.println("Address         : "+address);
		System.out.println("Department      : "+department);
	}
}
