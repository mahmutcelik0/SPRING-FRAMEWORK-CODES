package com.example.demo;

public interface ATTRIBUTES {
    String getSize();
    String getCutStyle();
    //LOWER -> FALSE ; UPPER -> TRUE
    Boolean isUpperorLowerClothing();

    default String myString() {
        String upOrLow = (isUpperorLowerClothing()) ? "UPPER" : "LOWER";
        return
                "SIZE: "+ getSize()
                        +"\nCUT STYLE: "+ getCutStyle()
                        +"\nUPPER or LOWER: " +upOrLow ;
    }

}
