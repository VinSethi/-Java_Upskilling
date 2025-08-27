package com.sparta.nam.Enums;

public class Season1 {
    public static void main(String[] args) {
        Season seasonOfTheYear = Season.SPRING;

        if(seasonOfTheYear == Season.SPRING || seasonOfTheYear == Season.SUMMER){
            System.out.println("The daffodils are out");
        } else {
            System.out.println("The daffodils aren't out");
        }

        for( Season season: Season.values()){
            System.out.println(season.name());

        }

    }
}
