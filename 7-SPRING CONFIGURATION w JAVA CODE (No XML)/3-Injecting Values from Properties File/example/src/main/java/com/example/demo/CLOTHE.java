package com.example.demo;

public interface CLOTHE {
    Double getPrice();
    String getShop();
    Boolean getGuarantee();

    default void printOutClothes() {
        String guarantee = (getGuarantee()) ? "YES": "NO";

        System.out.println(
                "PRICE: "+ getPrice()
                +"\nSHOP: "+ getShop()
                +"\nGUARANTEE: "+ guarantee);
    }
}
