package com.sparta.nam.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private static Date vaccinationDate;

    public Animal() {}

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Animal(String name, int age, String vaccinationDate) throws ParseException {
        setName(name);
        setAge(age);
        setVaccinationDate(vaccinationDate);
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }
    public String getName(){
        try{
            return name.toUpperCase();
        } catch(NullPointerException ex){
            System.out.println("Caught exception " + ex);
            System.out.println("Message " + ex.getMessage());
            return "No name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            throw new IllegalArgumentException("Age must not be negative: " + newAge);
        }
        age = newAge;
    }

    public void setName(String name) {
        if(name==null){
            throw new NullPointerException("The name cannot be a null");
        }this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaccinationDate=" + vaccinationDate +
                '}';
    }



    public static void setVaccinationDate(String dateString) throws ParseException {
        vaccinationDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);

    }




}


