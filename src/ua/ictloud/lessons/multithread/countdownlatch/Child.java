package ua.ictloud.lessons.multithread.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by student on 23-May-18.
 */
public class Child extends Thread {
    int numberChild;
    CountDownLatch countDownLatch;

    public Child(int numberChild, CountDownLatch countDownLatch) {
        this.numberChild = numberChild;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.countDown();
            System.out.println("come #" + numberChild + " ");
            countDownLatch.await();
            sleep(numberChild*1000+1000);
            System.out.println("I am #" + numberChild);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
