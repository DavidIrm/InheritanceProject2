package com.sda.abstractization.bean;

public class Triangle extends Shape {

    public boolean isSolid = true;

    public Triangle(int size){
        super( 3, size);
    }

    public double calculateArea(int marginNumbers, int marginSize) {
        return marginNumbers * marginSize;
    }


    @Override
    public double calculateArea() {
        return marginNumbers * marginSize;
    }

    @Override
    public String getColour(){
        return "Blue";
    }

}
