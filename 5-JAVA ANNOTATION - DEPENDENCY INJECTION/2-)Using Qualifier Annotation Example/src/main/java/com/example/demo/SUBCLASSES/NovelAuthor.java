package com.example.demo.SUBCLASSES;

import com.example.demo.AUTHOR;
import org.springframework.stereotype.Component;

@Component
public class NovelAuthor implements AUTHOR {
    @Override
    public String getInfoAboutAuthor() {
        return
                """
                        NAME: STEPHEN EDWIN
                        SURNAME: KING
                        BORN: 21 SEPTEMBER 1947
                        DEATH: -
                        WRITTEN BOOK COUNT: 47""";
    }
}
