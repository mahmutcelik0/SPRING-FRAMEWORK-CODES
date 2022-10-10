package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//1- Create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//2- Get bean from container
		SingletonScope firstSingleton = context.getBean("singletonScope",SingletonScope.class);
		SingletonScope secondSingleton = context.getBean("singletonScope",SingletonScope.class);

		//3- Use method
		System.out.println("---------------------------------------");
		System.out.println(firstSingleton);
		System.out.println(secondSingleton);
		System.out.println("---------------------------------------");


		//2- Get bean from container
		ProtoTypeScope firstPrototype = context.getBean("protoTypeScope",ProtoTypeScope.class);
		ProtoTypeScope secondPrototype = context.getBean("protoTypeScope",ProtoTypeScope.class);

		//3-Use method
		System.out.println("---------------------------------------");
		System.out.println(firstPrototype);
		System.out.println(secondPrototype);
		System.out.println("---------------------------------------");

		//4- close container
		context.close();
	}
}
