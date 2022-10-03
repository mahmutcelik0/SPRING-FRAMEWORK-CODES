package com.example.demo;

public class PoelAuthor implements AUTHOR{
    @Override
    public String getInfoAboutAuthor() {
        return
                """
                        NAME: ORHAN VELI
                        SURNAME: KANIK
                        BORN: 13 APRIL 1914
                        DEATH: 14 NOVEMBER 1950
                        WRITTEN BOOK COUNT: 37""";
    }
}
