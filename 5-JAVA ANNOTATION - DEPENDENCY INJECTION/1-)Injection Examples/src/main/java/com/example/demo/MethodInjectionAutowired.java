package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodInjectionAutowired implements BOOK{
    private AUTHOR poelAuthor;

    //we don't have to use set methods to change poelAuthor. We can give any name to method that makes instantiation .
    @Autowired
    private void methodInjectionAutowiredMethod(AUTHOR poelAuthor){
        this.poelAuthor = poelAuthor;
    }

    @Override
    public Integer getPagesCount() {
        return 1000;
    }
    @Override
    public String getNameOfBook() {
        return "METHOD INJECTION WITH JAVA ANNOTATION EXAMPLE";
    }

    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
                +"\n"+"PAGE: "+getPagesCount()+"\n"+poelAuthor.getInfoAboutAuthor());
    }

}
