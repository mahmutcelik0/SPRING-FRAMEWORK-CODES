package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class starterClass {
    public static void main(String[] args) {
        //1- Create container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(programConfigFile.class);

        //2- Get bean from container
        CLOTHE myClothe = context.getBean("jean",CLOTHE.class);
//        CLOTHE mySecondClothe = context.getBean("jean",CLOTHE.class);

        //3- Use methods from bean
        myClothe.printOutClothes();

        /*
        //Test for Scope - add @Scope annotation After @Bean annotation
        System.out.println(myClothe);
        System.out.println(mySecondClothe);
        */

        //4- close container
        context.close();
    }
}
