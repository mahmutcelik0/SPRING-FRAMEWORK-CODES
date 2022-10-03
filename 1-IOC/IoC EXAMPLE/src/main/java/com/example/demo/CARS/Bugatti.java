package com.example.demo.CARS;

public class Bugatti implements CAR{
    private final String model = "Bugatti VISION 2021";
    private final Integer price = 7850000;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + "\n" + price.toString();
    }
}
