package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Employee;

/**
 * Spring Program to demonstrate Dependency Injection using Constructor
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	/* Central Interface to provide configuration for Spring Application.
        It is responsible for instantiating, wiring,configuring & managing life cycle of Objects
         Implements Spring IOC */
         ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
        
        //Get the Employee Bean/Object from xml file
        Employee e1=(Employee) context.getBean("emp1");
        e1.display();
        
        Employee e2=(Employee) context.getBean("emp2");
        e2.display();
        
        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
