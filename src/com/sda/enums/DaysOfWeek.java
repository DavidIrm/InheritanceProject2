package com.sda.enums;

public enum DaysOfWeek {
    MONDAY(1,"This is the first day"),
    TUESDAY(2, "This is the 2nd day"),
    WENSDAY(3,"This is the 3rd day"),
    THURSDAY(4, "This is the 4th day"),
    FRIDAY(5, "This is the 5th day"),
    SATURDAY(6, "This is the 6th day"),
    SUNDAY(7, "This is the 7th day");

    // good practice to make them final to be not modified during runtime
    private final int value;
    private final String description;

    DaysOfWeek(int value, String description){
        this.value=value;
        this.description=description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }


 /*   This is a very bad practice
    public void setDescription(String description) {
        this.description = description;
    }
    */

}
