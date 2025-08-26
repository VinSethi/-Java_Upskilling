package com.sparta.nam.controlflows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class SelectionTests {

    @ParameterizedTest
    @ValueSource(ints = {0,40,64})
    public void givenAMarkLessThan65_getGradeIfElse_ReturnsFail(int mark){
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(mark));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void givenAPriorityOf0_giveGreen(int level){
        Assertions.assertEquals("Code Green", Selection.priority(level));
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    public void givenAPriorityOf1_giveAmber(int level){
        Assertions.assertEquals("Code Amber", Selection.priority(level));
    }

    @ParameterizedTest
    @ValueSource(ints = {3})
    public void givenAPriorityOf3_giveRed(int level){
        Assertions.assertEquals("Code Red", Selection.priority(level));
    }

    @ParameterizedTest
    @ValueSource(ints = {99})
    public void givenAPriorityOf99_giveError(int level){
        Assertions.assertEquals("Error", Selection.priority(level));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 64})
    public void givenAConditionalOperator(int mark){
        Assertions.assertEquals("Fail", Selection.getGradeConditionalOperators(mark));
    }

    @ParameterizedTest
    @ValueSource(ints = {65,84})
    public void givenAConditionalOperatorsOf65To84(int mark){
        Assertions.assertEquals("Pass", Selection.getGradeConditionalOperators(mark));
    }


    @ParameterizedTest
    @ValueSource(ints = {85})
    public void givenAConditionalOperators(int mark){
        Assertions.assertEquals("Distinction", Selection.getGradeConditionalOperators(mark));
    }



}
