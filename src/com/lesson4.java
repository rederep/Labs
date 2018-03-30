package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//massive

public class lesson4 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int arr[] = new int[10];
        int arr2[] = new int[5];
        Random rand = new Random();

        arr[3] = 1;
        arr2[0] = 99;
        //arr2 = arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.arraycopy(arr, 0, arr2, 1, 1);
        System.out.println(Arrays.toString(arr2));


        System.out.println(arr == arr2);
        System.out.println(Arrays.equals(arr, arr2));

//        System.out.println();
//        int seratcValue = 2;
//        int retValue = Arrays.binarySearch(arr,seratcValue);
//        System.out.println(retValue);
//
//        System.out.println();
//        Arrays.sort(arr);
//
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//
//        retValue = Arrays.binarySearch(arr,seratcValue);
//        System.out.println(retValue);


//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//        System.out.print("Enter size of massiv: ");
//        int size = scan.nextInt();
//        System.out.print("Enter max randrom: ");
//        int maxRand = scan.nextInt();
//        int arr[][] = new int[size][size];
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                arr[i][j] = rand.nextInt(maxRand);
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

      /*  for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();*/
//побочная
   /*     for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE-1-i; j < SIZE-i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }*/

        // System.out.println();

//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j<SIZE-i-1; j++) {
//                    System.out.print(arr[i][j] + "\t");
//              }
//            System.out.println();
//        }


  /*      for (int i = 1; i < SIZE-1; i++) {
            for (int j = SIZE-i; j!=SIZE  && j!=SIZE; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }*/

    }
}
