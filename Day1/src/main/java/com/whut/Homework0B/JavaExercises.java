package com.whut.Homework0B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeDice()));

        System.out.println(Arrays.toString(takeOrder("Erik")));

        System.out.println(findMinMax(new int[]{3,8,4,6,9,10,20,4,7}));

        System.out.println(hailstone(10));
    }

    public static int[] makeDice() {
        return new int[]{1,2,3,4,5,6};
    }

    public static String[] takeOrder(String name) {
        if (name.equals("Ergun")) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if (name.equals("Erik")) {
            return new String[]{"sushi" , "pasta" , "avocado" , "coffee"};
        } else {
            return new String[3];
        }
    }

    public static int findMinMax(int[] array) {
        int m_min = Integer.MAX_VALUE, m_max = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length ; i++) {
            m_min = Math.min(m_min,array[i]);
            m_max = Math.max(m_max,array[i]);
        }
        return m_max - m_min;
    }

    public static List<Integer> hailstone(int n) {
        List<Integer> L = new ArrayList<>();
        while(n!=1) {
            L.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        L.add(n);
        return L;
    }

}
