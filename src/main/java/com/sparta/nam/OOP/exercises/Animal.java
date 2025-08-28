package com.sparta.nam.OOP.exercises;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private String firstName;
    private final LocalDate birthDate;

    public Animal(String firstName, int year, int month, int day) {
        this.firstName = firstName;
        this.birthDate = LocalDate.of(year, month, day);
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public Integer getAge(){
        LocalDate localDate = LocalDate.now();
        Period ageMonthYears = Period.between(birthDate, localDate);
        int ageYears = ageMonthYears.getYears();
        return ageYears;
    }

    public String toString(){
        return this.getFirstName() + " is " + this.getAge() + " years old";
    }


    public abstract String speak();

}
