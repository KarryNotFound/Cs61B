package com.whut.class4;

public class SLList {
    public IntNode first;

    // Create a new SLList with one item, namely x.
    public SLList(int x){
        first = new IntNode(x,null);
    }

    // Adds item x to the front of the list
    public void addFirst(int x){
        first = new IntNode(x,first);
    }

    // Gets the first item in the list
    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
    }
}
