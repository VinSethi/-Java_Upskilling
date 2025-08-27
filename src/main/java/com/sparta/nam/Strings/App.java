package com.sparta.nam.Strings;

public class App {
    public static void main(String[] args) {
        String name = "   Nish   ";
        char c = name.charAt(4);
        name = name.toLowerCase();
        name = name.trim();
        c = name.charAt(3);
        System.out.println(name);

        System.out.println();
        System.out.println(stringExercise("  Java list fundamentals "));

    }

    public static String stringExercise(String myString){
        myString = myString.trim();
        myString = myString.toUpperCase();
        myString = myString.replace('L','*');
        myString = myString.replace('T','*');
        int index = myString.indexOf('N');
        var finalString = myString.substring(0,index+1);

        return finalString;
    }
}

