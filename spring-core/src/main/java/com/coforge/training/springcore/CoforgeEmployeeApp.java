package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.training.springcore.model.CoforgeEmployee;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:59:40 pm
* Project:spring-core
*/

/*
 * Example of using Spring Core Dependency Injection (DI) with an CoforgeEmployee class. 
 * This example will demonstrate how to inject dependencies into the CoforgeEmployee class, 
 * such as a Department and an MyAddress using Java Configuration.
 */

public class CoforgeEmployeeApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		CoforgeEmployee emp1=(CoforgeEmployee)context.getBean("employee1", CoforgeEmployee.class);
		emp1.displayEmployeeInfo();
		
		System.out.println();
		
		CoforgeEmployee emp2=(CoforgeEmployee)context.getBean("employee2", CoforgeEmployee.class);
		emp2.displayEmployeeInfo();
		
        ((AnnotationConfigApplicationContext) context).close();



	}

}
