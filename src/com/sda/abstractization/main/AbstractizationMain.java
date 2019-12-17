package com.sda.abstractization.main;

import com.sda.abstractization.bean.Shape;
import com.sda.abstractization.bean.Triangle;

public class AbstractizationMain {

    public static void main(String[]args){

        Triangle myTriangle = new Triangle(4);
        System.out.println("Area of: myTriangle is: "+myTriangle.calculateArea());
        System.out.println("Colour of: myTriangle is: "+myTriangle.getColour()+" and is solid= "+myTriangle.isSolid);

        Shape myShape = new Triangle(3);
        System.out.println("Area of: myShape is: "+myShape.calculateArea());
        System.out.println("Colour of: myShape is: "+myShape.getColour()+" and is solid= "+myShape.isSolid);

    }
}
