package com.sda.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Car myMycar = new Car("BMW");
        boolean b = true;

        while (b) {

            System.out.println("do you want to increase the speed? \n" +
                    "If yes, press Y, esle press N");

            Scanner s = new Scanner(System.in);
            String userCommand = s.next();

            if (userCommand.equalsIgnoreCase("Y")) {
                try {
                    myMycar.increaseSpeed();
                    System.out.println("Speed increased " + myMycar.getName() + "" +
                            "have speed: " + myMycar.getSpeed());
                } catch (CarCrushedException | NumberFormatException e) {
                    System.out.println(e.getMessage());
                    b=false;
                }catch(Exception e){
                    System.out.println("Exception occured: "+e.getMessage());

                }
            }

            System.out.println("To stop press: Q else press any Key");

            if (s.next().equalsIgnoreCase("q")) {
                b = false;
            }


        }

    }
}
