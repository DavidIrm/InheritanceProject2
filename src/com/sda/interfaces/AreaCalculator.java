package com.sda.interfaces;

import com.sda.makeCalculation.Square;

public class AreaCalculator  implements  AreaCalculatorInterface {

    @Override
    public double calculateTriangleArea(int base, int hight) {
        return (base*hight)/2;
    }

    @Override
    public double calculateSquareArea(int margin) {
        return  Math.pow(margin, 2);
    }

    @Override
    public double calculateSquareArea(Square square) {
        return Math.pow(square.getSize(), 2);
    }
}
