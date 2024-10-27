package com.whut.homework1;

public class Homework1_4 {
    public static void main(String[] args){
        String A = "HelloWorld";
        printIndexed(A);
    }


    public static void printIndexed(String input){
        for(int i = input.length()-1 ; i >= 0 ; i--){
            System.out.print(input.charAt(i)+""+i);
        }
        System.out.println();
    }
}
