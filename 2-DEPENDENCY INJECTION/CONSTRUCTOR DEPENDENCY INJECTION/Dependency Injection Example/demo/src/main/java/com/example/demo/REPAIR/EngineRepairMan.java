package com.example.demo.REPAIR;

public class EngineRepairMan implements RepairMan{

    public EngineRepairMan() {
        System.out.println("CAR MADE ACCIDENT. NOW IN ENGINE REPAIR MAN");
    }


    @Override
    public String getCostOfRepair() {
        return "IT COSTS 2300 $ ";
    }
}
