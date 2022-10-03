package com.example.demo;

import com.example.demo.INJECTIONCLASSES.ConstructorInjectionAutowired;
import com.example.demo.INJECTIONCLASSES.FieldInjectionAutowired;
import com.example.demo.INJECTIONCLASSES.MethodInjectionAutowired;
import com.example.demo.INJECTIONCLASSES.SetterInjectionAutowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		//1- Create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2- Get bean from container

		//CONSTRUCTOR EXAMPLE
//		ConstructorInjectionAutowired contructorInjectionEx = context.getBean("constructorInjectionAutowired", ConstructorInjectionAutowired.class);

		//SETTER INJECTION EXAMPLE
//		SetterInjectionAutowired setterInjectionEx = context.getBean("setterInjectionAutowired",SetterInjectionAutowired.class);

		//METHOD INJECTION EXAMPLE
//		MethodInjectionAutowired methodInjectionEx = context.getBean("methodInjectionAutowired", MethodInjectionAutowired.class);

//		FIELD INJECTION EXAMPLE
		FieldInjectionAutowired fieldInjectionEx = context.getBean("fieldInjectionAutowired",FieldInjectionAutowired.class);

		//3- method example of Bean
		//CONSTRUCTOR EXAMPLE
//		contructorInjectionEx.printOutInfos();

		//SETTER INJECTION EXAMPLE
//		setterInjectionEx.printOutInfos();

		//METHOD INJECTION EXAMPLE
//		methodInjectionEx.printOutInfos();

		//FIELD INJECTION EXAMPLE
		fieldInjectionEx.printOutInfos();

		//4- close container
		context.close();
	}
}
