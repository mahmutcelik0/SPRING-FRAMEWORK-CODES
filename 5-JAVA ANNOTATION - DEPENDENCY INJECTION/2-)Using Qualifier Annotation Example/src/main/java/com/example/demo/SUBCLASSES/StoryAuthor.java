package com.example.demo.SUBCLASSES;

import com.example.demo.AUTHOR;
import org.springframework.stereotype.Component;

@Component
public class StoryAuthor implements AUTHOR {
    @Override
    public String getInfoAboutAuthor() {
        return
                """
                        NAME: ROBERT LOUIS
                        SURNAME: STEVENSON
                        BORN: 13 NOVEMBER 1850
                        DEATH: 3 DECEMBER 1894
                        WRITTEN BOOK COUNT: 75""";
    }
}
