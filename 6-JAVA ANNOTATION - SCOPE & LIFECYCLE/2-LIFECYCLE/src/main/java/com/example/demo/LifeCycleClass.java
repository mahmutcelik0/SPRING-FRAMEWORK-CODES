package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleClass implements BOOK{

    private AUTHOR author;

    @PostConstruct
    public void afterConstruct(){
        System.out.println("BEAN IS CREATING");
    }

    @PreDestroy
    private void preDestroy(){
        System.out.println("BEAN IS DESTROYING");
    }

    @Autowired
    public LifeCycleClass(@Qualifier("poelAuthor") AUTHOR author){
        this.author = author;
    }

    @Override
    public Integer getPagesCount() {
        return 30;
    }

    @Override
    public String getNameOfBook() {
        return "LIFECYCLE CLASS EXAMPLE";
    }
}
