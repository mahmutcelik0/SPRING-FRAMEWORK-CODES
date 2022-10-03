package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionAutowired implements BOOK{

    private AUTHOR poelAuthor;

    @Autowired
    public void setPoelAuthor(AUTHOR poelAuthor){
        this.poelAuthor = poelAuthor;
    }

    @Override
    public Integer getPagesCount() {
        return 332;
    }
    @Override
    public String getNameOfBook() {
        return "SETTER INJECTION WITH JAVA ANNOTATIONS EXAMPLE";
    }


    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
                +"\n"+"PAGE: "+getPagesCount()+"\n"+poelAuthor.getInfoAboutAuthor());
    }
}
