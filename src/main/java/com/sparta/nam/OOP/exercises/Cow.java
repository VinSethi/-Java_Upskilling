package com.sparta.nam.OOP.exercises;

public class Cow extends Animal{


    private String favouriteFood;


    public Cow(String firstName, int year, int month, int day, String favouriteFood) {
        super(firstName, year, month, day);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String speak() {
        return "MOOOOOOO";
    }

    @Override
    public String toString(){
        return super.toString() + "has a favourite food of" + favouriteFood;
    }
}
