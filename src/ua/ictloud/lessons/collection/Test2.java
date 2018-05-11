package ua.ictloud.lessons.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by student on 11-May-18.
 */
public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String var;
        Queue<String> print = new LinkedList<>();
        while (true) {
            System.out.print("Enter name of file (0 - exit and print): ");
            var = sc.nextLine();
            if (var.equals("0")) {
                do {
                    System.out.print(print.poll() + " ");
                } while (print.size() != 0);
                break;
            }
            print.add(var);
        }
    }
}
