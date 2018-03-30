package com.oop.met;

/**
 * Created by student on 30-Mar-18.
 */
public class Methods {

    public static int count = 0;

    public Methods() {
        count++;
    }


    public static void goFor(int end) {
        for (int i = 0; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goFor(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void goFor(int start, int end, int step) {
        count = 9;
        for (int i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goFor(double end) {
        for (int i = 0; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goAll(String n, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("n=" + n);
    }

    public void goAllNew(int... arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            summ += arr[i];
        }
        System.out.println("\nsumm = " + summ);
        System.out.println("Count = " + arr.length);
        System.out.println("Average = " + summ / arr.length);

    }


}
