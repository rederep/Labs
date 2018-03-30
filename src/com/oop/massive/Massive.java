package com.oop.massive;

import java.util.Random;

public class Massive {

    final int SIZE = 10;

    public int[] getArray() {
        Random rand = new Random(10);
        int arr[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



}
