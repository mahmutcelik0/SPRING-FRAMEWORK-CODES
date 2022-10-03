package com.example.demo.INJECTIONCLASSES;

import com.example.demo.AUTHOR;
import com.example.demo.BOOK;
import com.example.demo.SUBCLASSES.PoemAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionAutowired implements BOOK {
    @Autowired
    @Qualifier("storyAuthor")
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
