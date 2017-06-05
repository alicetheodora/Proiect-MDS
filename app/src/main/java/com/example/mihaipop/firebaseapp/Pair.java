package com.example.mihaipop.firebaseapp;

/**
 * Created by mihaipop on 04/06/2017.
 */

public class Pair {

    private String first;
    private String last ;

    Pair(){}

    Pair(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}
