package com.example.demo.HUMAN;

public class Lung implements ORGAN{
    @Override
    public String getDuty() {
        return "ENSURE BALANCE IN CARBONDIOXIDE AND OXYGEN";
    }

    @Override
    public Integer getCount() {
        return 2;
    }
}
