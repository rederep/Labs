package ua.ictloud.lessons.multithread.semaphore.test;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23-May-18.
 */
public class Main {
    public static void main(String[] args) {
        Table[] t = new Table[20];
        Semaphore s = new Semaphore(4);

        for (int i = 0; i < t.length; i++) {
            t[i] = new Table(new Famely(i), s);
            t[i].start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
