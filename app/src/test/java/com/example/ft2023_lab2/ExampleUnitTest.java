package com.example.ft2023_lab2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.ft2023_lab2.utils.TextCounter;

public class ExampleUnitTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString ="";
        String expectedValue = "0";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_NullString_Result_Zero() {
        String givenString =null;
        String expectedValue = "0";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_WhenFiveCharsString_Result_Zero() {
        String givenString = "12345";
        String expectedValue = "5";
        String actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_EmptyString_ReturnZero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_EmptySpaces_ReturnZero() {
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_TextString_ReturnNumber() {
        String givenString = "Hello everyone";
        int expectedValue = 2;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_SymbolAndSpaces_ReturnNumber(){
        String givenString = "  :) ? ";
        int expectedResult = 2;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

}