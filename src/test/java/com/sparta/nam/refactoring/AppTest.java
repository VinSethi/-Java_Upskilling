package com.sparta.nam.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
public class AppTest {
//    @Test
//    @DisplayName("My first test")
//    public void firstTest(){
//        Assertions.assertEquals();
//
//    }

    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good morning")
    public void getGreeting_GivenATimeOf6_ReturnsGoodMorning(){
        // Arrange
        int time = 6;
        String expected = "Good morning";
        // Act
        String actual = App.getGreeting(time);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 14, returns good afternoon")
    public void getGreeting_GivenATimeOf14_ReturnsGoodAfternoon(){
        // Arrange
        int time = 14;
        String expected = "Good afternoon";
        // Act
        String actual = App.getGreeting(time);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_GivenATimeOf21_ReturnsGoodEvening(){
        // Arrange
        int time = 21;
        String expected = "Good evening";
        // Act
        String actual = App.getGreeting(time);
        //Assert
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {5,11})
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning")
    public void getGreeting_GivenATimeFrom50To11_ReturnsGoodMorning(int time){
        Assertions.assertEquals("Good morning", App.getGreeting(time));

    }

    @ParameterizedTest
    @ValueSource(ints = {12, 18})
    @DisplayName("getGreeting, when given a time 12 to 18, returns good afternoon")
    public void getGreeting_GivenATimeFrom12To11_ReturnsGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 23})
    @DisplayName("getGreeting, when a given time 19 to 23, returns good evening")
    public void getGreeting_GivenATimeFrom19To23_ReturnsGoodEvening(int time){
        Assertions.assertEquals("Good evening", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening, 2",
            "Good morning, 8",
            "Good afternoon, 15",
            "Good evening, 21"
    })
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String expected,int time){
        Assertions.assertEquals(expected, App.getGreeting(time));
    }

}
