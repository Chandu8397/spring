package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:11:33:54 am
* Project:spring-core
* 
* ---POJO Class for Setter Injection
*/

public class Student {

	private int rollNo;
	private String name,college;
	private double marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}
