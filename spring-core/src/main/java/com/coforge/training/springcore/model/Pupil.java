package com.coforge.training.springcore.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/*
* Author: Mekapothula.Reddy
* Date: 20 Nov 2024
* Time:12:31:21 pm
* Project:spring-core
* 
DI using Constructor using Annotation Configuration
Dependency Injection (DI) is a design pattern that allows a class to have its 
dependencies provided externally, rather than creating them internally. 
In Spring, DI can be achieved using annotations like @Component, @Autowired, and @Qualifier.*/

//@Component is used to mark the Pupil class as a Spring-managed bean.
@Component
public class Pupil {
	
	private long id;
	private String name;
	private String email;
	private LocalDate DOB;
	private int age;
	
	public Pupil() {
		super();
		this.id = 103L;
		this.name ="Trishul";
		this.email = "trishul03@gmail.com";
		DOB = LocalDate.of(2000, 12, 12);
		this.age = 12;
	}

	//Generate Getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Pupil [id=" + id + ", name=" + name + ", email=" + email + ", DOB=" + DOB + ", age=" + age + "]";
	}

}
