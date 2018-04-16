package com.oop.met2;

import java.util.Random;

/**
 * Created by student on 30-Mar-18.
 */
public class Methods {


    public int returnMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public int[] arrayCreate(int size) {
        Random rand = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    public void arrayWork(int... arr) {
        System.out.println("Print Even values: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void arrayEvenIndex(int... arr) {
        System.out.println("Print values with Even index: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
