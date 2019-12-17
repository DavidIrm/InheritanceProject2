package com.sda.abstractization.bean;

public  abstract class Shape {

    public boolean isSolid = false;
    double area;
    int marginNumbers;
    int marginSize;

    public Shape(int marginNumbers, int marginSize) {
        this.marginNumbers = marginNumbers;
        this.marginSize = marginSize;
    }

    public abstract double calculateArea();


    public String getColour(){
        return "Red";
    }


}
