package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("jean")
public class Jean implements CLOTHE {


    private ATTRIBUTES attributes;

    //AUTOWIRED ADDED FROM IDE(HIDDEN)
    @Autowired
    public Jean(@Qualifier("jeanAttribute") ATTRIBUTES attributes){
        this.attributes = attributes;
    }

    @Override
    public Double getPrice() {
        return 399.50;
    }

    @Override
    public String getShop() {
        return "MAVI";
    }

    @Override
    public Boolean getGuarantee() {
        return true;
    }

    @Override
    public void printOutClothes() {
        System.out.println("com.example.demo.CLOTHE NAME: JEAN\n"+attributes.myString());
        CLOTHE.super.printOutClothes();
    }

    /*
    //BELOW PARTS HAVE WRITTEN FOR LIFECYCLE EXAMPLE
    @PostConstruct
    private void postConstructMethod(){
        System.out.println("----------------------");
        System.out.println("INIT METHOD IS WORKING");
        System.out.println("----------------------");
    }

    @PreDestroy
    private void preDestroyMethod(){
        System.out.println("-------------------------");
        System.out.println("DESTROY METHOD IS WORKING");
        System.out.println("-------------------------");
    }
    */

}
