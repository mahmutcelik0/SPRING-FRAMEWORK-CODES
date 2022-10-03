package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//Create container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//get bean from container
//		DatabaseBook book = context.getBean("dbBook",DatabaseBook.class);
		BOOK book1 = context.getBean("exampleBook",BOOK.class);
		//call methods from bean
		System.out.println(book1.getNameOfBook());
		//close container
		context.close();

	}

}
