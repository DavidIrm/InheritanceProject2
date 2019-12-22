package com.sda.makeCalculation;

import com.sda.interfaces.AreaCalculator;
import com.sda.interfaces.AreaCalculatorInterface;

public class Calculator {


    public static void main(String[]args){

     AreaCalculatorInterface areaCalculator = new AreaCalculator();

    Square mySquare = new Square(12);

    System.out.println("Area of the square is: "+areaCalculator.calculateSquareArea(mySquare.getSize()));




    }
}
