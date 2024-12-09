package com.coforge.training.springcore;
//Spring Configuration Class for Annotations

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.Product;

@Configuration
@ComponentScan(basePackages="com.coforge.training.springcore.model")

public class AppConfig {
	

@Bean
    public Product product1() {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1500.00);
        return product;
    }

    @Bean
    public Product product2() {
        Product product = new Product();
        product.setName(" Apple Smartphone");
        product.setPrice(800.00);
        return product;
    }

    @Bean
    public Product product3() {
        Product product = new Product();
        product.setName("Tablet");
        product.setPrice(600.00);
        return product;
    }

}
