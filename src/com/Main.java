package com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Begin from: ");
            int start = scan.nextInt();
            System.out.print("end of: ");
            int end = scan.nextInt();

            if ((start > 0) && (end > 0)) {

                if (start > end) {
                    int temp = end;
                    end = start;
                    start = temp;
                }

                for (int i = start; i < end; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " event");
                    } else {
                        if ((i == 33) || (i == 66) || (i == 99)) {

                        }
                        else {
                            if (i % 3 == 0) {
                                System.out.println(i + " / 3");
                            }
                            if (i >= 10 && i <= 20) {
                                System.out.println(i + " in from 10 to 20");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Error");
            }

            System.out.println("Replay? yes: 1, no: 0");
            int checkInt = 0;
            checkInt = scan.nextInt();
            if (checkInt != 1) {
                break;
            }


            int[] arr = new int[10];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }
    }
}
