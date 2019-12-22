package com.sda.exceptions;

public class ExceptionChecker {

    public static void main(String[] args) {
        // Aritmetic Exception Example
        try {
        //    int dividedResult = 55 / 0;

            System.out.println("Everithing is all right");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Exception is handled");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException Exception is handled");
            System.out.println(ex.getMessage());
        }
        catch(Exception e ){
            System.out.println("Exception is handled");
            System.out.println(e.getMessage());

        }
        // optional
        finally {
            System.out.println("Finally running");
        }

        System.out.println("the program still running");

    }
}
