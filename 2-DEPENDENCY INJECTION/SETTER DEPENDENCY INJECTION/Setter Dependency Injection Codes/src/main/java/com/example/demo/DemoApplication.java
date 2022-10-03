package com.example.demo;

import com.example.demo.CLASSES.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		Coach myCoach = context.getBean("footballCoach",Coach.class);

		//call methods on beans
		System.out.println(myCoach.getDailyFortune());

		//close the context
		context.close();
	}

}
