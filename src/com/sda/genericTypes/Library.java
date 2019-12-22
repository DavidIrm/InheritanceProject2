package com.sda.genericTypes;

public class Library<T> {

    private  T item;

    public Library(T item) {
        this.item = item;
    }

    public void makeCommonStuff(T item){
        System.out.println("This method is common for all objects");
    }

    public T getItem() {
        return item;
    }
}
