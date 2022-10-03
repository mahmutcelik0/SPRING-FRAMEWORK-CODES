package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ExampleDefaultBook implements BOOK {

    @Override
    public Integer getPagesCount() {
        return 500;
    }
    @Override
    public String getNameOfBook() {
        return "EXAMPLE OF DEFAULT BEAN ID BOOK";
    }
}
