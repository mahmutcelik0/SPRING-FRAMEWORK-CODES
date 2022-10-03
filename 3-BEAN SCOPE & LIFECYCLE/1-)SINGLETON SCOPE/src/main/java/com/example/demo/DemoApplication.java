package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//Create container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//get bean from container
		//DatabaseBook beanFromContainer = context.getBean("dbBook",DatabaseBook.class);

		//call method from bean
		//beanFromContainer.printOutInfos();

		//singleton test
		DatabaseBook firstBean = context.getBean("dbBook",DatabaseBook.class);
		DatabaseBook secondBean = context.getBean("dbBook",DatabaseBook.class);

		System.out.println("FIRST BEAN MEMORY ADDRESS: " +firstBean+"\nSECOND BEAN MEMORY ADDRESS: "+secondBean);

		//close container
		context.close();

	}

}
