package com.whut.Homework0B;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {

    public static void main(String[] args) {
        Map<Character, Integer> m1 = letterToNum();
        m1.forEach((key,value)->{
            System.out.println(key + " " + value);
        });

        Map<Integer, Integer> m2 = squares(Arrays.asList(1,4,2,3,2,6));
        m2.forEach((key,value)->{
            System.out.println(key + " " + value);
        });


    }

    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> m = new TreeMap<>();
        int i = 1;
        for(char s = 'a'; s <= 'z' ; s++, i++) {
            m.put(s,i);
        }
        return m;
    }

    public static Map<Integer, Integer> squares(List<Integer> nums){
        Map<Integer, Integer> m = new TreeMap<>();
        if(nums.isEmpty()) return m;
        for(int i = 0 ; i < nums.size() ; i++) {
            m.put(nums.get(i),nums.get(i)*nums.get(i));
        }
        return m;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> m = new TreeMap<>();
        if(words.isEmpty()) return m;
        for(String s : words) {
            m.put(s, m.getOrDefault(s,0)+1);
        }
        return m;
    }
}
