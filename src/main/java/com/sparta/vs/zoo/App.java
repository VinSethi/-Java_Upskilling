package com.sparta.vs.zoo;

import com.sparta.nam.OOP.exercises.Animal;
import com.sparta.nam.OOP.exercises.Eagle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Animal2 cow = new Cow("scottish Cow", 2019, 4, 10);
        Staff zookeeper = new Zookeeper("Jeff", 2020, 5, 4, "Cow");


        System.out.println(((Zookeeper) zookeeper).feedAnimal());




         ArrayList<Speakable> zooThings = new ArrayList<>();
         zooThings.add(zookeeper);
         zooThings.add(cow);

         for(Speakable p: zooThings){
             System.out.println(p.talk());
         }


    }

}
