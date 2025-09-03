package com.sparta.nam.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AnimalTests {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "10,10"
    })
    @DisplayName("Give an age of 0 or above, setAge changes the age")
    public void setAgeHappyPath(int newAge, int expectedAge){
        Animal sut = new Animal();
        sut.setAge(newAge);
        Assertions.assertEquals(expectedAge, sut.getAge());
    }

    @Test
    @DisplayName("Given an age below zero, setAge throws an IllegalArgumentException")
    public void setAgeSadPath(){
        Animal sut = new Animal();
        // invoke a method, and return anything it throws
        // we then store it in the `exception` variable
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> sut.setAge(-2) );
        Assertions.assertEquals("Age must not be negative: -2", exception.getMessage());
    }

    // Create tests for setName (happy and sad) and setVaccincation date (happy & sad)


    @Test
    @DisplayName("Will throw a NullPointerException if name== null")
    public void setNameSadPath(){
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(NullPointerException.class, () -> sut.setName(null));
        Assertions.assertEquals("The name cannot be a null", exception.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Test to show that a new name can be created")
    @CsvSource({
            "Fido, FIDO",
            "Max, MAX"
    })
    public void setNameHappyPath(String newName, String expectedName){
        Animal sut = new Animal();
        sut.setName(newName);
        Assertions.assertEquals(expectedName, sut.getName());
    }


    @Test
    @DisplayName("When an invalid date is provided for vaccinationDate, a parse exception will be thrown")
    public void setVaccinationDateSadPath(){
        Animal sut = new Animal("Minky", 3);
        var exception = Assertions.assertThrows(ParseException.class, () -> sut.setVaccinationDate("May 14, 2022"));
    }

    @ParameterizedTest
    @CsvSource({
            "14-05-2022, 14/05/2022",
            "24-02-2022, 24/02/2022"
    })
    public void setVaccinationDateHappyPath(String newDate, String expectedDate) throws ParseException {
        Animal sut = new Animal("Pinky", 3);

        sut.setVaccinationDate(newDate);
        String actualDate = new SimpleDateFormat("dd/MM/yyyy").format(sut.getVaccinationDate());  // Converts the Date object back into a string
        Assertions.assertEquals(expectedDate, actualDate);

    }

}
