package com.sparta.nam.collections;

import com.sparta.nam.OOP.Member;

import java.util.*;

import static com.sparta.nam.collections.CollectionsLab.longWordList;
import static com.sparta.nam.collections.CollectionsLab.makeFiveSet;

public class App {
    public static void main(String[] args) {
        // Array Lists
//        List<String> nameList = new ArrayList<>();
//        nameList.add("Nish");
//        nameList.add("Nash");
//        nameList.add("Nosh");
//
//        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4)); // int --> Integer
//        for(var num : nums){
//            System.out.println(num); // Integer --> int
//        }
//
//        Integer [] ints = {1,2,3,4,5};
//        var arrList = Arrays.asList(ints);


        ArrayList<Integer> num2= new ArrayList<>(List.of(1,2,3,4,5));
        num2.add(2,7);
        Collections.reverse(num2);
        num2.remove(1);
        System.out.println(num2);

        // HashSet (revisit)
        HashSet<Member> memberSet = new HashSet<>();
        memberSet.add(new Member("Nish", "Mandal", 2025,3,12));
        memberSet.add(new Member("Nish", "Mandal", 2025,3,12));
        memberSet.add(new Member("Hash", "Mandol", 2023,3,13));
        memberSet.add(new Member("Nash", "Cheded", 2025,3,13));
        System.out.println("memberSet: ");
        for(Member m : memberSet){
            System.out.println(m);
        }

        if(memberSet.contains(new Member("Nish", "Mandal", 2025,3,12))){
            System.out.println("Nish is in the set");
        } else {
            System.out.println("Nish is not in the set");
        }

        // Queues and Stacks
        // HashMaps (activitiy)
        // Collections activity

        System.out.println(makeFiveSet(10));
        System.out.println(longWordList("Hello my name is Vineet"));

    }

}
