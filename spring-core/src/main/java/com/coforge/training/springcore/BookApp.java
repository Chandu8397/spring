package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Book;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:00:57 pm
* Project:spring-core
* 
* Spring Program to demonstarte XML configration
*/

public class BookApp {

	public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("BookConfig.xml");
		 
		 Book b1=(Book) context.getBean("book1");
		 Book b2=(Book) context.getBean("book2");
		 Book b3=(Book) context.getBean("book3");
		 
		 b1.display();
		 b2.display();
		 b3.display();
		 
		 ((ClassPathXmlApplicationContext) context).close();

	}

}
