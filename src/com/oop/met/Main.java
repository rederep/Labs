package com.oop.met;

import java.util.SortedMap;

/**
 * Created by student on 30-Mar-18.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Methods.count);
        Methods.goFor(5);

        Methods met = new Methods();
        System.out.println(Methods.count);

        int arr[] = new int[10];
//        met.goFor(10);
//        met.goFor(2,8);
//        met.goFor(1,100,10);
//        met.goFor(4.0);
//        met.goAll("asd", 6, 3, 7, 2);
//        met.goAll("asd", arr);

       // met.goAllNew(2,3,5);
        show();
    }

    public static void show(){
        System.out.println("Hello");
    }
}
