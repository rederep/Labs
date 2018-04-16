package com.oop.univerextends;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by student on 13-Apr-18.
 */
public class Main {
    public static void main(String[] args) {
        Human mH = new Human();
        Human mS = new Student();
        Human mT = new Teacher();




        Student[] hArray = new Student[3];
        hArray[0] = new Student();
        hArray[1] = new Student();
        hArray[2] = new Student();

        for (int i = 0; i < hArray.length; i++) {
            System.out.println(hArray[i]);
        }


        Human[] hArray2 = new Human[3];
        hArray2[0] = mH;
        hArray2[1] = mS;
        hArray2[2] = mT;
        for (int i = 0; i < hArray2.length; i++) {
            hArray2[i].show();      //
        }



        Human h1 = new Student("Vasya", "Petrov", 20, 12);
        Human h2 = new Student("Vasya", "Petrov", 20, 12);
        Human h3 = new Teacher("Vasya", "Petrov", 20, 1252.2);
        Human h4 = new Teacher("Petya", "Petrov", 25, 1212.2);

        System.out.println();
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h1.equals(h1));
        System.out.println();
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h3.equals(h4));
    }
}
