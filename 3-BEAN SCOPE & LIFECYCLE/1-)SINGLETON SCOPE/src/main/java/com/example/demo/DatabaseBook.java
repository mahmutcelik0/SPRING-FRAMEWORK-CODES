package com.example.demo;

public class DatabaseBook implements BOOK{

    private AUTHOR authorInfo;

    //CONSTRUCTOR INJECTION
    public DatabaseBook(AUTHOR authorInfo) {
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
