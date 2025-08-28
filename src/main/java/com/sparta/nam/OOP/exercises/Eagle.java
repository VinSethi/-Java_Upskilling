package com.sparta.nam.OOP.exercises;

public class Eagle extends Animal {

    private String favouriteFood;


    public Eagle(String firstName, int year, int month, int day, String favouriteFood) {
        super(firstName, year, month, day);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String speak() {
        return "noise";
    }

    @Override
    public String toString(){
        return super.toString() + "has a favourite food of" + favouriteFood;
    }


}
