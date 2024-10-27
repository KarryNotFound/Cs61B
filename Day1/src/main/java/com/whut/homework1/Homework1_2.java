package com.whut.homework1;

public class Homework1_2{

    public static void main(String[] args){
        int i = 5;
        while(i>0){
            i-=1;
            for(int j = 5 ; j > i ; j-=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}