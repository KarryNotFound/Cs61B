package com.whut.class2;

public class IntList {
    public int first;
    public IntList rest;

//    Return the size of the list using -- recursion!
    public int size(){
        if(rest == null){
            return 1;
        }
        return rest.size()+1;
    }

    // Returns the size of the list using no recursion
    public int iterativeSize(){
        int totalSize = 0;
        IntList p = this;
        while( p != null){
            p = p.rest;
            totalSize += 1;
        }
        return totalSize;
    }

    // Return the i'th item in the list
    public int get(int i){
        if (i == 0) return first;
        return this.rest.get(i - 1);
    }


    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public static void main(String[] args) {
        IntList I = new IntList(5,null);
        I.rest = new IntList(10,null);
        I.rest.rest = new IntList(13,null);

        System.out.println(I.get(1));
    }
}
