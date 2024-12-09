package com.coforge.training.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.CoforgeEmployee;
import com.coforge.training.springcore.model.Department;
import com.coforge.training.springcore.model.MyAddress;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:52:24 pm
* Project:spring-core
*/

//Java Configuration file for Constructor DI
//Define Beans for MyAddress, Department & CoforgeEmployee

@Configuration
public class EmployeeConfig {
	
	@Bean
	public MyAddress address1() {
		return new MyAddress("123 Main Street", "Spring Field"); //returns address1 Object
	}
	
	@Bean
	public MyAddress address2() {
		return new MyAddress("456 Temple Street", "Mathura"); //returns address2 Object
	}
	
	@Bean
	public Department department1() {
		return new Department("Engineering"); //returns department1 Object
	}
	
	@Bean
	public Department department2() {
		return new Department("Sales"); //returns department2 Object
	}
	
	@Bean
	public CoforgeEmployee employee1() {
		return new CoforgeEmployee(101,"John Doe",address1(),department1()); //returns employee1 Object
	}
	
	@Bean
	public CoforgeEmployee employee2() {
		return new CoforgeEmployee(102,"Ram Kumar",address2(),department2()); //returns employee2 Object
	}
	
	

	
}
