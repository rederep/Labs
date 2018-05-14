package ua.ictloud.lessons.multithread;

import java.util.Random;

/**
 * Created by student on 14-May-18.
 */
public class TestM2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + ") " + "№" + i);
            try {
                Thread.sleep(new Random().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " is ended");
    }
}
