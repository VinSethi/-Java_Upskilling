package com.sparta.vs.zoo;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Staff implements Speakable {
    private LocalDate dateOfEmployment;
    private String enclosure;
    private String name;


    public Staff( String name,int year, int month, int day, String enclosure) {
        this.dateOfEmployment = LocalDate.of(year, month, day);
        this.enclosure = enclosure;
        this.name = name;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getName() {
        return name;
    }


    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

}
