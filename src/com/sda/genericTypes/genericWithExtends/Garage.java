package com.sda.genericTypes.genericWithExtends;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {

    public static int capacity = 100;
    List<T> myCars = new ArrayList<T>();


    public Garage() {

    }

    public void addVehicle(T vehicle) {
        if (capacity > 0) {
            myCars.add(vehicle);
            capacity--;
        } else {
            System.out.println("I am sorry my friend. Park on the road.\n" +
                    "Good luck!");
        }
    }

    public void leaveGarage(T vehicle) {
        // tema
    }

    public int getCapacity() {
        return capacity;
    }

    public void displayAllVehicles() {

    /*    for(int i=0;i<myCars.size();i++){
            System.out.println(myCars.get(i));
        }
        */

        for (Vehicle vechicle : myCars) {
            System.out.println(vechicle);
        }
    }
}



