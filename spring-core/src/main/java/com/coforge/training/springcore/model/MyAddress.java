package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:45:16 pm
* Project:spring-core
*/

/*
 * Example of using Spring Core Dependency Injection (DI) with an CoforgeEmployee class. 
 * This example will demonstrate how to inject dependencies into the CoforgeEmployee class, 
 * such as a Department and an MyAddress using Java Configuration.
 */

public class MyAddress {
	
	private String street;
	private String city;
	
	public MyAddress(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "MyAddress [street=" + street + ", city=" + city + "]";
	}
	
	
	
	

	
}
