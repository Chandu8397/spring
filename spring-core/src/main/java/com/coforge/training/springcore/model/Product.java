package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:21:29 pm
* Project:spring-core
*
*/

//Bean class for setter Injection using Annotation Configuration
public class Product {
	
	private String name;
	private double price;
	
	//generating Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	

}
