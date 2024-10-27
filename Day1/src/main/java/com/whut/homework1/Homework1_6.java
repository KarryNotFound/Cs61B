package com.whut.homework1;

import java.util.Scanner;

public class Homework1_6 {
    public static void main(String[] args){
        while(true) {
            Scanner s = new Scanner(System.in);
            int x, y;
            x = s.nextInt();
            y = s.nextInt();
            System.out.println(quadrant(x, y));
        }
    }

    public static int quadrant(double x, double y){
            if ( x > 0 && y > 0) return 1;
            else if (  x < 0 && y > 0 ) return 2;
            else if ( x < 0 && y < 0 ) return 3;
            else if ( x > 0 && y < 0 ) return 4;
            else return -1;
    }
}
