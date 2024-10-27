package com.whut.class2;

public class Dog {

    public int weightInPounds;

    public Dog(int w){
        this.weightInPounds = w;
    }

    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("yipyijweiwpo");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("arooooooo");
        }
    }
}
