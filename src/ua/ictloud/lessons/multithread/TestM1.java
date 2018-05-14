package ua.ictloud.lessons.multithread;

import java.util.Random;

/**
 * Created by student on 14-May-18.
 */
public class TestM1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + "(" + getId() + ") " + "№" + i);
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " is ended");
    }
}
