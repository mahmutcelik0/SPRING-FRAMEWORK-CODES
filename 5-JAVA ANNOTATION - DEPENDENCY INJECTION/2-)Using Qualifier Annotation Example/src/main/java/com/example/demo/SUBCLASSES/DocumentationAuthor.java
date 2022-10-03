package com.example.demo.SUBCLASSES;

import com.example.demo.AUTHOR;
import org.springframework.stereotype.Component;

@Component
public class DocumentationAuthor implements AUTHOR {

    @Override
    public String getInfoAboutAuthor() {
        return
                """
                        NAME: ELA FATMANUR
                        SURNAME: CELIK
                        BORN: 21 MAY 2013
                        DEATH: -
                        WRITTEN BOOK COUNT: 0""";
    }
}
