package com.whut.class5;



public class SLList<Pineapple> {

    public class IntNode {
        public Pineapple item;
        public IntNode next;

        public IntNode(Pineapple f, IntNode r){
            item = f;
            next = r;
        }
    }

    // The first Item, if it exists, is at sentinel.next
    private IntNode sentinel;
    private int size;



    // Create a new SLList with one item, namely x.
    public SLList(Pineapple x){
        sentinel = new IntNode(null,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    // Create an empty SLList
    public SLList() {
        sentinel = new IntNode(null,null);
        size = 0;
    }

    // Adds item x to the front of the list
    public void addFirst(Pineapple x){
        sentinel.next = new IntNode(x,sentinel.next);
        size += 1;
    }

    // Gets the first item in the list
    public Pineapple getFirst() {
        return sentinel.next.item;
    }

    // Adds an element in the end of the list
    public void addLast(Pineapple x) {
        size += 1;
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);


    }

    //Returns the size of the list
//    public int size() {
//        return size(first);
//    }
        public int size() {
            return size;
        }

    // Returns the size of the list, starting at IntNode p
    private int size(IntNode p) {
            if(p.next == null) return 1;
            return 1 + size(p.next);
    }


    public static void main(String[] args) {

        SLList<String> L = new SLList<>();


    }
}
