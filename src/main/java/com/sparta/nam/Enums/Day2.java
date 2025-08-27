package com.sparta.nam.Enums;

public class Day2 {
    public static void main(String[] args) {
        Day2_Enum dayOfTheWeek = Day2_Enum.MONDAY;

        switch (dayOfTheWeek){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Have a lovely day at work!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Relax and enjoy");
                break;
        }

    }
}
