package com.sda.inheritance.main;

import com.sda.inheritance.bean.Animal;
import com.sda.inheritance.bean.Cat;

public class Main {

    public static void main(String[] args){

        Animal yetty = new Animal("Tom", "Scottish", 2, 4);
        yetty.speak();
        displayCat(yetty);
       // BAD
       // Cat cat2 = (Cat) new Animal("Tom", "Scottish", 2, 4);
        // BAD
      //  Cat cat3 = (Cat) cat;

        Cat cat4 = new Cat("Bobi", "British", 3, 4, false);

     //   Animal animal = cat4;

        displayCat(cat4);
        cat4.speak();

        Cat cat5 = new Cat("Pisi", "Persian", 12, 2, false);
        cat5.speakFromAnimal();

        Animal cat6 = new Cat("Tom", "Scottish", 2, 4,true);
        displayCat(cat6);
        cat6.speak();

    }

    private static void displayCat(Animal cat) {
        System.out.println("Nume pisica: "+cat.getName()+" are rasa: "+cat.getRace());
    }
}