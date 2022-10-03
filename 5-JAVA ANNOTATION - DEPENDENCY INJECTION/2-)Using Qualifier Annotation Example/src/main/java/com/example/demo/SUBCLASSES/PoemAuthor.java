package com.example.demo.SUBCLASSES;


import com.example.demo.AUTHOR;
import org.springframework.stereotype.Component;

@Component // Creates a bean that has a poelAuthor ID and it will autowired for constructor injection
public class PoemAuthor implements AUTHOR {
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
