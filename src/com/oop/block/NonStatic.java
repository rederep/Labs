package com.oop.block;

/**
 * Created by student on 11-Apr-18.
 */
public class NonStatic {

    private static int counter = 0;
    private int num;

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Non static block init 1");
        counter++;
        num = 0;
    }

    public NonStatic() {
        System.out.println("Constructor init " + counter);
    }

    public NonStatic(int num) {
        this.num = num;
        System.out.println("Constructor init second " + counter);
    }

    public void show() {
        int i = 0;
        {
            int k = i + i;
            i += k;
        }
        int k = 9;
        int num = 7;
        System.out.println("One: " + (i + k));
    }

    public void say() {
        int k = 99;
        System.out.println("two: " + this.num);

    }
}
