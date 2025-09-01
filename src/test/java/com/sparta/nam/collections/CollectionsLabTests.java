package com.sparta.nam.collections;

import com.sparta.nam.OOP.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.sparta.nam.collections.CollectionsLab.makeFiveSet;
import static com.sparta.nam.collections.CollectionsLab.longWordList;

public class CollectionsLabTests {

    @Test
    @DisplayName("getFullName returns the correct name")
    public void makeFiveSetTest(){
        // Arrange
        HashSet<Integer> set = makeFiveSet(10);
        // Act
        HashSet<Integer> expected = new HashSet<>();
        expected.add(5);
        expected.add(10);
        // Assert
        Assertions.assertEquals(expected,set);
    }
    @Test
    @DisplayName("getFullName returns the correct name")
    public void longWordListTest(){
        // Arrange
        ArrayList<String> result = longWordList("Hello my name is Vineet");
        // Act
        ArrayList<String> expected= new ArrayList<>();
        expected.add("Hello");
        expected.add("Vineet");
        // Assert
        Assertions.assertEquals(expected,result);
    }


}
