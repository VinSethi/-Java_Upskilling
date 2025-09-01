package com.sparta.vs.zoo;


public class Cow extends Animal2 {

    public Cow(String firstName, int year, int month, int day) {
        super(firstName, year, month, day);
    }

    @Override
    public String speak() {
        return "";
    }

    @Override
    public String talk() {
        return "Hi I am a Cow named" + getFirstName();
    }

}
