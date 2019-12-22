package com.sda.genericTypes.genericWithExtends;

public class Car extends Vehicle implements VehicleComparatorInterface<Car>{

    private String model;

    public Car(String model, int year) {
        super(year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "year='" + super.getYear() + '\'' +
                '}';
    }

    @Override
    public void compareVehicle(Car vehicle) {

    }
}
