package com;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of masiv: ");
        int size = scan.nextInt();
        Random rand = new Random();
        int arr[] = new int[size];
        int summ = 0;
        int mul = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) - 5;
            if (arr[i] >= 0) {
                summ += arr[i];
            } else {
                mul *= arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n summ = " + summ);
        System.out.println("proiz = " + mul);


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("enter value of " + (i+1) + " number: ");
//            arr[i] = scan.nextInt();
//        }
//
//        for (int i : arr) {
//             System.out.println(i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }
}
