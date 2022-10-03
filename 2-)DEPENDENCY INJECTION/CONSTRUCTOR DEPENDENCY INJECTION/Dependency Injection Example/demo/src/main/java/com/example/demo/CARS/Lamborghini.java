package com.example.demo.CARS;

import com.example.demo.REPAIR.RepairMan;

public class Lamborghini implements CAR{
    private final String model = "Lamborghini HURACAN";
    private final Integer price = 2300000;

    //TO MAKE CONSTRUCTOR DEPENDENCY INJECTION
    private RepairMan repair;

    public Lamborghini() {
        System.out.println("NOW! LAMBORGHINI IS ON WAY");
    }

    public Lamborghini(RepairMan repair) {
        System.out.println("LAMBORGHINI WILL MAKE AN ACCIDENT");
        this.repair = repair;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String getRepairCost() {
        return repair.getCostOfRepair();
    }

    @Override
    public String toString() {
        return model + "\n" + price.toString();
    }
}
