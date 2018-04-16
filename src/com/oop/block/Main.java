package com.oop.block;

/**
 * Created by student on 11-Apr-18.
 */
public class Main {
    public static void main(String[] args) {
        NonStatic n1 = new NonStatic();
        NonStatic n2 = new NonStatic(2);
        n1.show();
        n1.say();
        n2.say();
    }
}
