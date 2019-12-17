package com.sda.inheritance.bean;

public class Cat extends Animal {

    boolean purr;
    String name;

    public Cat(String name, String race, int age, int legsNumber, boolean purr) {
        super(name, race, age, legsNumber);
        this.purr = purr;
        this.name="Nume Default";
    }

    @Override
    public void speak(){
        System.out.println("miau miau");
    }

    public void speakFromAnimal(){
        super.speak();
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
