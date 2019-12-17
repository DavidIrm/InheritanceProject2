package com.sda.inheritance.bean;

public class Animal {
    private String name;
    private String race;
    private int age;
    private int legsNumber;


    public Animal(String name, String race, int age, int legsNumber) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.legsNumber = legsNumber;
    }

    public void speak(){
        System.out.println("crrrrrr");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }
}
