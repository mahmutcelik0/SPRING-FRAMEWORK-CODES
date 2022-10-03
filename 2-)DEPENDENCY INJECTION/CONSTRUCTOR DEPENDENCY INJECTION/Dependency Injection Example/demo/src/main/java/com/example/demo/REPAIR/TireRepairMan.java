package com.example.demo.REPAIR;

public class TireRepairMan implements RepairMan{

    public TireRepairMan() {
        System.out.println("CAR MADE ACCIDENT. NOW IN TIRE REPAIR MAN");
    }

    @Override
    public String getCostOfRepair() {
        return "IT COSTS 250 $";
    }
}
