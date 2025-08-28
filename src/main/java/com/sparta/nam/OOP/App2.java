package com.sparta.nam.OOP;

public class App2 {
    public static void main(String[] args) {
        BaseballMember zainab = new BaseballMember("Zainab", "Farooq", 2022,12,6, "fielder");
        System.out.println(zainab.getFullName());
        System.out.println(zainab.getMemberDays());
        System.out.println(zainab.getPosition());
        zainab.setPosition("pitcher");
        System.out.println(zainab.getPosition());


//        System.out.println(m1.getClass());
//        System.out.println(m1.toString());
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.hashCode());
//        System.out.println(m2.hashCode());

        System.out.println(zainab.getClass());
        System.out.println(zainab.toString());
        System.out.println(zainab.hashCode());



    }



}
