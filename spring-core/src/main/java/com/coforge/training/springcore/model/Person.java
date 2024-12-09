package com.coforge.training.springcore.model;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:07:59 pm
* Project:spring-core
*/

public class Person {
	
	  
	  	private int id;
		private String name;
		private Address address; // has-a relationship - Address Object
		
		

		
		public void setId(int id) {
			this.id = id;
		}




		public void setName(String name) {
			this.name = name;
		}




		public void setAddress(Address address) {
			this.address = address;
		}




		public void display() {
			System.out.println("********** Person Information **************");
			System.out.println(this.id+" "+this.name);
			System.out.println(address);
		}

}
