package com.example.demo.CLASSES;

public class HelloFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "GOOD MORNING!";
    }
}
