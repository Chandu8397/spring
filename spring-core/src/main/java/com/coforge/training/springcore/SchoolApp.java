package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.training.springcore.model.School;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:46:01 pm
* Project:spring-core
*/



public class SchoolApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		School school1 =context.getBean(School.class);
		
		school1.display();
		
		((AnnotationConfigApplicationContext) context).close();


	}

}
