package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class starterClass {
    public static void main(String[] args) {
        //1- Create container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(programConfigFile.class);

        //2- Get bean from container
        Jean myClothe = context.getBean("jean",Jean.class);
//        CLOTHE mySecondClothe = context.getBean("jean",CLOTHE.class);

        //3- Use methods from bean
//        myClothe.printOutClothes();

        //Test for injecting values from properties file
        myClothe.propertyResults();

        //Test for value injection example
        myClothe.results();
        //4- close container
        context.close();
    }
}
