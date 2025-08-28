package com.sparta.nam.OOP;

import com.sparta.nam.OOP.exercises.Animal;
import com.sparta.nam.OOP.exercises.Cow;
import com.sparta.nam.OOP.exercises.Eagle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTests {

//    @Test
//    @DisplayName("getFirstName should display the name Fluffy")
//    //Arrange
//    public void getFirstNameTest(){
//        // Arrange
//        Animal sut = new Animal("Fluffy", 2020, 5, 6 );
//        // Act
//        String result = sut.getFirstName();
//        // Assert
//        Assertions.assertEquals("Fluffy", result);
//    }
//
//    @Test
//    @DisplayName("getAge should display the name age")
//    //Arrange
//    public void getAgeTest(){
//        // Arrange
//        Animal sut = new Animal("Fluffy", 2020, 5, 6 );
//        // Act
//        int result = sut.getAge();
//        // Assert
//        Assertions.assertEquals(5, result);
//    }
//
//    @Test
//    @DisplayName("setFirstName should display the name age")
//    //Arrange
//    public void setFirstNameTest(){
//        // Arrange
//        Animal sut = new Animal("Fluffy", 2020, 5, 6 );
//        // Act
//        sut.setFirstName("Fido");
//        // Assert
//        Assertions.assertEquals("Fido", sut.getFirstName());
//    }


    @Test
    @DisplayName("getSpeakTest should display MOOOOOOO")
    //Arrange
    public void getSpeakTest(){
        // Arrange
        Cow sut = new Cow("scottish Cow", 2019, 04, 10, "Grass");
        // Act
        String result = sut.speak();
        // Assert
        Assertions.assertEquals("MOOOOOOO", result);
    }


    @Test
    @DisplayName("getToStringTest should display scottish Cow is 6 years oldhas a favourite food ofGrass ")
    //Arrange
    public void getToStringTest(){
        // Arrange
        Cow sut = new Cow("scottish Cow", 2019, 04, 10, "Grass");
        // Act
        String result = sut.toString();
        // Assert
        Assertions.assertEquals("scottish Cow is 6 years oldhas a favourite food ofGrass", result);
    }

    @Test
    @DisplayName("getSpeakTest should display noise")
    //Arrange
    public void getSpeakTestForEagle(){
        // Arrange
        Eagle sut = new Eagle("Striker", 2020, 5, 6, "mice");
        // Act
        String result = sut.speak();
        // Assert
        Assertions.assertEquals("noise", result);
    }

    @Test
    @DisplayName("getToSpringTest should display noise")
    //Arrange
    public void getToSpringTestForEagle(){
        // Arrange
        Eagle sut = new Eagle("Striker", 2020, 5, 6, "mice");
        // Act
        String result = sut.toString();
        // Assert
        Assertions.assertEquals("Striker is 5 years oldhas a favourite food ofmice", result);
    }





}
