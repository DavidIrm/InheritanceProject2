package com.sda.genericTypes.genericWithExtends;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Garage<Vehicle> myGarage = new Garage<>();

        Vehicle myBMW = new Car("BMW", 1992);
        Motorcycle myMoror = new Motorcycle("Honda", 2019);

        myGarage.addVehicle(myBMW);
        myGarage.addVehicle(myMoror);

        System.out.println("Garage capacity is: "+myGarage.getCapacity());

        myGarage.displayAllVehicles();
        List<Vehicle> vechicleList = new LinkedList<>();

        try {
            System.out.println(vechicleList.get(10));
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
