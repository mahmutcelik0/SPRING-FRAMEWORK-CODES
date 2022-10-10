package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//1- Create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//2- Get bean from container
		BOOK methods = context.getBean("lifeCycleClass",BOOK.class);

		//3- Use methods

		//4- close container
		context.close();
	}
}
