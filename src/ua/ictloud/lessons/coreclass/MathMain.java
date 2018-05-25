package ua.ictloud.lessons.coreclass;

import java.math.BigInteger;

/**
 * Created by student on 25-May-18.
 */
public class MathMain {
    public static void main(String[] args) {
        double x = 10;
        System.out.println(Math.abs(-23.234));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.7));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.rint(3.1));
        System.out.println(Math.rint(3.8));
        System.out.println(Math.cos(45));
        System.out.println(Math.log10(56));
        System.out.println(Math.pow(3, 3));   //степень
        System.out.println(Math.pow(77.0, (4.0 / 5.0)));
        System.out.println(Math.random());       //от 0 до 1
        System.out.println((int) (Math.random() * 100));
        System.out.println();

        x = (Math.sin(73) + Math.cos(14)) / Math.tan(11) * Math.pow(7.0, (1.0 / 3.0));
        System.out.println(x);




    }
}
