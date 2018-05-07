package ua.ictloud.lessons.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by student on 07-May-18.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some words: ");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        StringBuilder sb2 = new StringBuilder();
        Deque<Character> strChar = new ArrayDeque<>();
        for (int i = 0; i < sb.length(); i++) {
            strChar.addFirst(sb.charAt(i));
        }

        for (int i = 0; i < sb.length(); i++) {
            sb2.insert(i, strChar.pollFirst());
        }
        System.out.println(sb2.toString());
    }

}
