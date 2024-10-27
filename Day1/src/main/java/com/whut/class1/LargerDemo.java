package com.whut.class1;

public class LargerDemo {

    public static double larger(double x,double  y){
        if(x > y) return x;
        else return y;
    }

    public static void main(String[] args){
        System.out.println(larger(-5,10));
    }
}


