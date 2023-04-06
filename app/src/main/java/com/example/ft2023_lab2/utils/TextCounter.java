package com.example.ft2023_lab2.utils;

public class TextCounter {
    public static String getCharsCount(String inputString){
        if(inputString != null){
            return String.valueOf(inputString.length());
        }
        return "0";
    }
    public static int getWordsCount(String inputString)
    {
        String words = inputString.trim();
        if(words.isEmpty())
            return 0;
        return words.split("\\s+").length;
    }
}
