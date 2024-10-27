package com.whut.Homework0B;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfC(Arrays.asList("wcwc"),'c'));
    }

    public static int sum(List<Integer> L) {
        if(L.isEmpty()) return 0;
        int sum = 0;
        for(int i = 0 ; i < L.size() ; i++){
            sum += L.get(i);
        }
        return sum;
    }

    public static List<Integer> evens(List<Integer> L){
        if(L.isEmpty()) return new ArrayList<>();

        List<Integer> tem = new ArrayList<>();
        for(int i = 0 ; i < L.size() ; i++) {
            if(L.get(i) % 2 == 0) tem.add(L.get(i));
        }

        return tem;
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> res = new ArrayList<>();
        if(L1.isEmpty() || L2.isEmpty()) return res;
        for(int i = 0 ; i < L1.size() ; i++) {
            if(L2.contains(L1.get(i))) res.add(L1.get(i));
        }
        return res;
    }

    public static int countOccurrencesOfC(List<String> words, char c) {
        if(words.isEmpty()) return 0;
        int cnt = 0;
        for(String s : words) {
            for(int i = 0 ; i < s.length() ; i++) {
                if(s.charAt(i) == c) cnt++;
            }
        }
        return cnt;
    }


}
