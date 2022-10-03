package com.example.demo.INJECTIONCLASSES;

import com.example.demo.AUTHOR;
import com.example.demo.BOOK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //creates databaseBook Bean
public class ConstructorInjectionAutowired implements BOOK {

    private AUTHOR authorInfo;

    @Autowired
    public ConstructorInjectionAutowired(@Qualifier("storyAuthor")AUTHOR authorInfo) {
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
