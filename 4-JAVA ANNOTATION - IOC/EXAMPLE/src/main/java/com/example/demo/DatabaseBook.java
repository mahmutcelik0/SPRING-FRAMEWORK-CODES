package com.example.demo;

import org.springframework.stereotype.Component;

@Component("dbBook") //BEAN WILL ADD CONTAINER WITH dbBook ID IF WE DON'T WANT TO GIVE A ID, DEFAULT ID WILL WORK
//@Component -> BEAN WILL ADD CONTAINER WITH databaseBook ID. It takes lowercased capital classes name DatabaseBook -> databaseBook
public class DatabaseBook implements BOOK{

    @Override
    public Integer getPagesCount() {
        return 450;
    }

    @Override
    public String getNameOfBook() {
        return "DEPTH OF DATABASE";
    }

    public void printOutInfos(){
        System.out.println("--------------------------"+"\nNAME OF BOOK: "+getNameOfBook()
        +"\n"+"PAGE: "+getPagesCount()+"\n--------------------------");
    }
}
