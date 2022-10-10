package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    //Below parts have written for test application.properties values
    @Value("${person.name}")
    private String studentName;
    @Value("${person.mail}")
    private String studentMail;
    @Value("${person.department}")
    private String studentDepartment;

    public void propertyResults(){
        System.out.println(
                "NAME: "+ studentName
                +"\nMAIL: "+ studentMail
                +"\nDEPARTMENT: "+ studentDepartment
        );
    }

    //Below parts have written for test injecting values example
    @Value("MIGROS")
    private String marketName;
    @Value("true")
    private Boolean value;

    public void results(){
        System.out.println(
                "MARKET NAME: "+ marketName
                +"\nVALUE: "+ value
        );
    }

}
