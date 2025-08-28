package com.sparta.nam.OOP.exercises;

import com.sparta.nam.OOP.Member;

public class App {
    public static void main(String[] args) {
        Animal eagle = new Eagle("Striker", 2020, 5, 6, "mice");
        Animal cow = new Cow("scottish Cow", 2019, 04, 10, "Grass");
        Animal eagle2 = new Eagle("Thunderbolt", 2021, 8, 9, "humans");
        Animal cow2 = new Cow("British Cow", 2023, 9,4, "Hay" );



        Animal[] animals = {eagle,cow, eagle2, cow2};

        for(Animal x: animals){
            System.out.println(x.speak());
            System.out.println(x.toString());
        }
    }




}
