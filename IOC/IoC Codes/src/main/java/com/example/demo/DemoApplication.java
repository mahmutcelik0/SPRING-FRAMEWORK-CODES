package com.example.demo;

import com.example.demo.CoachClasses.Coach;
import com.example.demo.CoachClasses.FootBallCoach;
import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		//THIS BELOW PART IS NOT USING IoC or SPRING FEATURES.
		Coach coach = new FootBallCoach();

		//WE HAVE CREATED BEAN IN XML

		//CREATE SPRING CONTANER
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//RETRIEVE BEAN FROM CONTAINER
		Coach theCoach = context.getBean("myCoach",Coach.class);

		System.out.println(theCoach.getDailyWorkOut());

	}

}
