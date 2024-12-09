package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Person;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:18:53 pm
* Project:spring-core
*/

public class PersonApp {

	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("PersonConfig.xml");
		 
		 Person p1=(Person) context.getBean("person1");
		 p1.display();
		 
		 Person p2=(Person) context.getBean("person2");
		 p2.display();
		 
		 ((ClassPathXmlApplicationContext) context).close();

		 

		

	}

}
