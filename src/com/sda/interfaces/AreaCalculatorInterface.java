package com.sda.interfaces;

import com.sda.makeCalculation.Square;

public interface AreaCalculatorInterface {

    double calculateTriangleArea(int base, int hight);

    double calculateSquareArea(int margin);

    double calculateSquareArea(Square square);

}
