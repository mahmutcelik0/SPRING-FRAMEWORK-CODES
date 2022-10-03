package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //creates databaseBook Bean
public class ConstructorInjectionAutowired implements BOOK{

    private AUTHOR authorInfo;

    @Autowired
    public ConstructorInjectionAutowired(AUTHOR authorInfo) {
        this.authorInfo = authorInfo;
    }

    @Override
    public Integer getPagesCount() {
        return 450;
    }

    @Override
    public String getNameOfBook() {
        return "DEPTH OF DATABASE";
    }

    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
        +"\n"+"PAGE: "+getPagesCount()+"\n"+authorInfo.getInfoAboutAuthor());
    }
}
