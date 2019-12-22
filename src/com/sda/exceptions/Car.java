package com.sda.exceptions;

public class Car {

    private int speed=0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void increaseSpeed() throws CarCrushedException{
        speed +=70;
        if(speed>=200){
            throw  new CarCrushedException(this);
        }
  //      System.out.println("Car: "+this.name+" have speed: "+this.speed+" km/h");

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
