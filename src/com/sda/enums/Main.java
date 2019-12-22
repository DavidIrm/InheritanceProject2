package com.sda.enums;

public class Main {

    public static void main(String[]args){

        DaysOfWeek d = DaysOfWeek.MONDAY;
        System.out.println(d+" and have value: "+d.getValue());
        System.out.println(d+" and have description: "+d.getDescription());

        DaysOfWeek d2= DaysOfWeek.SATURDAY;
        System.out.println(d+" and have description: "+d2.getDescription());



        doDayToDayStuff(DaysOfWeek.FRIDAY);
        doDayToDayStuff(DaysOfWeek.MONDAY);


    }


    private static void doDayToDayStuff(DaysOfWeek day) {

        switch (day){
            case MONDAY:{
                System.out.println("Go to work");
                break;
            }
            case TUESDAY:{
                System.out.println("Go to work");
                break;
            }
            case WENSDAY:{
                System.out.println("Go to work");
                break;
            }
            case THURSDAY:{
                System.out.println("Go to work");
                break;
            }case FRIDAY:{
                System.out.println("Go to work then go to drink ");
                break;
            }
            case SATURDAY:{
                System.out.println("Do wathever you want");
                break;
            }
            case SUNDAY:{
                System.out.println("Do wathever you want");
                break;
            }
        }

    }
}

