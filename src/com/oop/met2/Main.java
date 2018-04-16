package com.oop.met2;

/**
 * Created by student on 30-Mar-18.
 */
public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        Methods met = new Methods();
        //  System.out.println(met.returnMax(-5, 5));

        met.arrayWork(met.arrayCreate(SIZE));
        met.arrayEvenIndex(met.arrayCreate(SIZE));


    }
}
