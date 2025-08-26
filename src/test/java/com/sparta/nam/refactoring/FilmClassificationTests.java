package com.sparta.nam.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {

    @ParameterizedTest
    @CsvSource({
            "'U, PG films are available.', 10",
            "'U, PG & 12 films are available.', 14",
            "'U, PG, 12 & 15 films are available.', 16",
            "'All films are available.', 18"
    })
    public void givenFilm_Classification_ReturnsAnAppropriateAge(String expected,int ageOfViewer){
        Assertions.assertEquals(expected, FilmClassification.getClassificationsByAge(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 11})
    @DisplayName("getClassificationsByAge, when a given age is 0 to 11, returns U and PG")
    public void givenFilm_Classification_ReturnsAnAppropriateAge(int ageOfViewer){
        Assertions.assertEquals("U, PG films are available.", FilmClassification.getClassificationsByAge(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    @DisplayName("getClassificationsByAge, when a given age is 12 to 14, returns U, PG and 12")
    public void givenFilm_Classification_ReturnsAnAppropriateAge12To14(int ageOfViewer){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    @DisplayName("getClassificationsByAge, when a given age is 15 to 17, returns U, PG, 12 and 15")
    public void givenFilm_Classification_ReturnsAnAppropriateAge15To17(int ageOfViewer){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {18})
    @DisplayName("getClassificationsByAge, when a given age is 15 to 17, returns U, PG, 12 and 15")
    public void givenFilm_Classification_ReturnsAnAppropriateAge18(int ageOfViewer){
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(ageOfViewer));
    }




}
