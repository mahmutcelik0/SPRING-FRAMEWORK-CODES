package com.example.demo.INJECTIONCLASSES;

import com.example.demo.AUTHOR;
import com.example.demo.BOOK;
import com.example.demo.SUBCLASSES.PoemAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionAutowired implements BOOK {

    private AUTHOR poelAuthor;

    @Autowired
    public void setPoelAuthor(@Qualifier("novelAuthor") AUTHOR poelAuthor){
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
