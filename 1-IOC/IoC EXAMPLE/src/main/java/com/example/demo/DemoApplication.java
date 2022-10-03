package com.example.demo;

import com.example.demo.CARS.Bugatti;
import com.example.demo.CARS.CAR;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;


public class DemoApplication {
	public static void main(String[] args) {
		//WITHOUT USING SPRING CONTAINER AND USING HARDCODED WAY AND NOT CONFIGURABLE
		/*
		CAR myCar = new Bugatti();
		System.out.println(myCar.toString());
		*/



		//WITH SPRING CONTAINER AND CONFIGURABLE WAY

		//1-) CONFIGURE BEANS IN XML (MADE IT)

		//2-) CREATE CONTAINER AND ADD BEANS USING APPLICATION CONTEXT
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//3-) WE NEED TO GET BEAN FROM CONTAINER (USE getBean(id,Interface.class))
		CAR myCar = context.getBean("myCar",CAR.class);

		//FINALLY WE CAN USE BEAN METHODS
		System.out.println(myCar);
		//OUTPUT :
		//Bugatti VISION 2021
		//7850000

		//IF WE WANT TO CONFIGURE BEAN (CHANGE BEANS CLASS)
		System.out.println(myCar);
		//OUTPUT :
		//Lamborghini HURACAN
		//2300000

		

	}

}
