package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.training.springcore.model.Product;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:2:25:21 pm
* Project:spring-core
* 
*/

public class ProductApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product product1 = context.getBean("product1", Product.class);
        Product product2 = context.getBean("product2", Product.class);
        Product product3 = context.getBean("product3", Product.class);

        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
        System.out.println("Product 3: " + product3);
        
        ((AnnotationConfigApplicationContext) context).close();

	}

}
