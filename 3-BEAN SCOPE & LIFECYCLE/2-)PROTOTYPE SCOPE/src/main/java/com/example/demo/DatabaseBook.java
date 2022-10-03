package com.example.demo;

public class DatabaseBook implements BOOK{

    private AUTHOR authorInfo;

    //SETTER INJECTION
    public void setAuthorInfo(PoelAuthor poelAuthor){
        this.authorInfo = poelAuthor;
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

    //INIT METHOD FOR LIFECYCLE
    public void initMethod(){
        System.out.println("BEFORE USING OF BEAN");
    }

    //DESTROY METHOD FOR LIFECYCLE
    public void destroyMethod(){
        System.out.println("AFTER USING OF BEAN");
    }
}
