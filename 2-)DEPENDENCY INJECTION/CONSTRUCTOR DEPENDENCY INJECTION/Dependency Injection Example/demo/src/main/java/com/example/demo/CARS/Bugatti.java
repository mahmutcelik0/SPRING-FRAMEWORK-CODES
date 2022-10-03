package com.example.demo.CARS;

import com.example.demo.REPAIR.RepairMan;

public class Bugatti implements CAR{
    private final String model = "Bugatti VISION 2021";
    private final Integer price = 7850000;


    //TO MAKE CONSTRUCTOR DEPENDENCY INJECTION
    private RepairMan repair;

    public Bugatti() {
        System.out.println("NOW! BUGATTI IS ON WAY");
    }

    public Bugatti(RepairMan repair) {
        System.out.println("BUGATTI WILL MAKE ACCIDENT");
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
    public String getRepairCost(){return repair.getCostOfRepair();}

    @Override
    public String toString() {
        return model + "\n" + price.toString();
    }
}
