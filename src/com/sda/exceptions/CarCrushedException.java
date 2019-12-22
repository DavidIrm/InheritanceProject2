package com.sda.exceptions;

public class CarCrushedException  extends  Exception {

    public CarCrushedException(Car car){
        super("Car "+car.getName()+" has crushed");

    }
}
