package com.example.demo;

import com.example.demo.CARS.CAR;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {
		// Firstly create container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Get bean
		CAR myCar = context.getBean("myLamborghini",CAR.class);

		System.out.println(myCar.getRepairCost());


	}

}
