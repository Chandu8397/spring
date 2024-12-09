package com.coforge.training.springweb.model;

/*
* Author: Mekapothula.Reddy
* Date: 21 Nov 2024
* Time:3:13:05 pm
* Project:spring-web
*/

public class Employee {
	
	private String name;
    private long id;
    private String contactNumber;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
