package com.sparta.nam.OOP;

public class App {
    public static void main(String[] args) {
        Member nish = new Member("Nish", "Mandal",2022,1,1);
        Member vineet = new Member("Vineet", "Sethi", 2002, 5, 14);
        Member Farah = new Member("Farah", "Cheded", 1993, 12, 17);
        Member Haashim= new Member("Haashim", "Alvi", 1997, 12, 4);


        Member[] members = {vineet, Farah, Haashim};

        /**
         *
         * for the for each loop, the first part you input is the data type, followed with the new variable name: group pf data name.
         * In the for loop, you do System.out.println(x.getFullName()), use the variable x as it will store through each loop the data that you want to display, then followed by the .getFullName()
         */
        for(Member x: members){
            System.out.println(x.getFullName());
        }

        // create a few more member objects
        // print out their names, using the getter methods
        // prinout the days since they have joined
        // create an array of member objects, loop through them, and get their full name

        System.out.println(nish.getFullName());
        System.out.println(nish.getMemberDays());
        System.out.println(vineet.getFullName());
        System.out.println(vineet.getMemberDays());
        System.out.println(Farah.getFullName());
        System.out.println(Farah.getMemberDays());
        System.out.println(Haashim.getFullName());
        System.out.println(Haashim.getMemberDays());
    }
}

