package com.sparta.vs.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Zootests {

    @Test
    @DisplayName("getSpeakTest should display Hi I am a Zookeeper namedJeff")
    //Arrange
    public void talkTest(){
        // Arrange
        Zookeeper sut = new Zookeeper("Jeff", 2020, 5, 4, "Cow");
        // Act
        String result = sut.talk();
        // Assert
        Assertions.assertEquals("Hi I am a Zookeeper namedJeff", result);
    }

    @Test
    @DisplayName("feedAnimalTest should display Jeffis feeding theCow")
    //Arrange
    public void feedAnimalTest(){
        // Arrange
        Zookeeper sut = new Zookeeper("Jeff", 2020, 5, 4, "Cow");
        // Act
        String result = sut.feedAnimal();
        // Assert
        Assertions.assertEquals("Jeffis feeding theCow", result);
    }


    @Test
    @DisplayName("getSpeakTest should display Hi I am a Zookeeper namedJeff")
    //Arrange
    public void talkTestForCow() {
        // Arrange
        Animal2 sut = new Cow("scottish Cow", 2019, 4, 10);
        // Act
        String result = sut.talk();
        // Assert
        Assertions.assertEquals("Hi I am a Cow namedscottish Cow", result);
    }

}
