package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionAutowired implements BOOK{
    @Autowired
    private AUTHOR poelAuthor;

    @Override
    public Integer getPagesCount() {
        return 2000;
    }

    @Override
    public String getNameOfBook() {
        return "FIELD INJECTION AUTOWIRED EXAMPLE";
    }

    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
                +"\n"+"PAGE: "+getPagesCount()+"\n"+poelAuthor.getInfoAboutAuthor());
    }
}
