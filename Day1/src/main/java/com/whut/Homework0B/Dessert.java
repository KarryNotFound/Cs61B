package com.whut.Homework0B;

public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts = 0;

    public Dessert(int f,int p){
        flavor = f;
        price = p;

        numDesserts++;
    }

    public void printDessert() {
        System.out.println(flavor + " " + price + " " + numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

}
