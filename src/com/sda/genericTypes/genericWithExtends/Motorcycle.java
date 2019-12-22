package com.sda.genericTypes.genericWithExtends;

/**
 *
 * @Author  MihaiP
 */
// mutam implementarea VehicleComparatorInterface la vehicle
public class Motorcycle extends Vehicle /* implements  VehicleComparatorInterface<Car>*/{

    private String model;

    public Motorcycle(String model, int year) {
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
        return "Motorcycle{" +
                "model='" + model + '\'' +
                "year='" + super.getYear() + '\'' +
                '}';
    }
/*
    @Override
    // dispare de aici si o mutam in vehicle
    public void compareVehicle(Car vehicle) {
        //afisam care masina este mai tanara
        if(this.getYear()<vehicle.getYear()){
            System.out.println();

        }

    }*/
}
