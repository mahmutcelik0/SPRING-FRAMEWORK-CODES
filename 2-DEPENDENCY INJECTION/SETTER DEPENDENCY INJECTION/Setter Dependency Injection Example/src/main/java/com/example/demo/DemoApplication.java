package com.example.demo;

import com.example.demo.HUMAN.BODY;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//creation of spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//getbean from container
		BODY body = context.getBean("humanBody",BODY.class);

		//use methods from bean
		System.out.println("---------------------------------------------");
		System.out.println(body.getCountsOfOrgans());
		System.out.println("---------------------------------------------");
		System.out.println(body.getOrgansWithDuties());
		System.out.println("---------------------------------------------");
		//close container
		context.close();

	}

}
