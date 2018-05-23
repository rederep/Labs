package ua.ictloud.lessons.multithread.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by student on 23-May-18.
 */
public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(23);
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(new Random().nextInt(1000) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Child(i, countDownLatch).start();
        }
        while (countDownLatch.getCount() > 3) {    //проверка на успел ли записаться в потоке, постоянно в цикле, пока не пришли все
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Are your reade?");
        countDownLatch.countDown();
        System.out.println("Yes, my Boss");
        countDownLatch.countDown();
        System.out.println("GO-GO-GO");
        countDownLatch.countDown();
        System.out.println("All childe has walk");


    }
}
