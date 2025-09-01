package com.sparta.nam.collections;

import com.sparta.nam.OOP.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionsLab {
    public static HashSet<Integer> makeFiveSet(int max){

        HashSet<Integer> set = new HashSet<>();
        for(int i= 1;  i<=max;i++){
        if (i % 5 == 0){
            set.add(i);
        }
        }
        return set;

        }


    public static ArrayList<String> longWordList(String phrase){
        String[] words = phrase.split(" ");
        ArrayList<String> list2= new ArrayList<>();
        for(String word: words){
            if (word.length()>= 5){
                list2.add(word);
            }
        }
        return list2;
    }

//    public static HashMap<String,Integer>CountOf9(String phrase) {
//        HashMap<Character, Integer> count9 = new HashMap<>();
//
//
//    }




}
