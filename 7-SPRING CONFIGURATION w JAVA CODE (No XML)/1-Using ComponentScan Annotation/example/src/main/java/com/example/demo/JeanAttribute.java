package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class JeanAttribute implements ATTRIBUTES {
    @Override
    public String getSize() {
        return "33 31";
    }

    @Override
    public String getCutStyle() {
        return "SLIM FIT";
    }

    //LOWER -> FALSE ; UPPER -> TRUE
    @Override
    public Boolean isUpperorLowerClothing() {
        return false;
    }

    @Override
    public String myString() {
        return ATTRIBUTES.super.myString();
    }
}
