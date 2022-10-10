package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //creates databaseBook Bean
@Scope("singleton")
public class SingletonScope implements BOOK{

    private AUTHOR authorInfo;

    @Autowired
    public SingletonScope(@Qualifier("poelAuthor") AUTHOR authorInfo) {
        this.authorInfo = authorInfo;
    }

    @Override
    public Integer getPagesCount() {
        return 450;
    }

    @Override
    public String getNameOfBook() {
        return "SINGLETON SCOPE EXAMPLE";
    }

    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
        +"\n"+"PAGE: "+getPagesCount()+"\n"+authorInfo.getInfoAboutAuthor());
    }
}
