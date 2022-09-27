package com.example.demo.CARS;

public class Lamborghini implements CAR{
    private final String model = "Lamborghini HURACAN";
    private final Integer price = 2300000;
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
