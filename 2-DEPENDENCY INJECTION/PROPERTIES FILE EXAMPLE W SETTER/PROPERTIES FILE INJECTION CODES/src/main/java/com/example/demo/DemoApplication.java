package com.example.demo;

import com.example.demo.CLASSES.Coach;
import com.example.demo.CLASSES.FootballCoach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		FootballCoach myCoach = context.getBean("footballCoach", FootballCoach.class);

		//call methods on beans
		System.out.println("-------------------------");
		System.out.println(myCoach);
		System.out.println("-------------------------");

		//close the context
		context.close();
	}

}
