package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtoTypeScope implements BOOK{

    private AUTHOR authorInfo;

    public ProtoTypeScope(@Qualifier("poelAuthor") AUTHOR authorInfo){
        this.authorInfo = authorInfo;
    }

    @Override
    public Integer getPagesCount() {
        return 231;
    }

    @Override
    public String getNameOfBook() {
        return "PROTOTYPE SCOPE EXAMPLE";
    }

    public void printOutInfos(){
        System.out.println("NAME OF BOOK: "+getNameOfBook()
                +"\n"+"PAGE: "+getPagesCount()+"\n"+authorInfo.getInfoAboutAuthor());
    }
}
