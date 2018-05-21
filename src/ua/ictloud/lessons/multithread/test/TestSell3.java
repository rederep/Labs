package ua.ictloud.lessons.multithread.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by student on 21-May-18.
 */
public class TestSell3 extends Thread {
    private TestSellColl sell;

    public TestSell3(TestSellColl sell) {
        this.sell = sell;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        do {
            int tmp = rnd.nextInt(5000) - 10000;
            try {
                sleep(20000 + tmp);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (sell) {
                sell.setSell(sell.getSell() + 500);
                System.out.println("+500ua, bank = " + sell.getSell() + "   " + this.getName());
            }
        } while (sell.getSell() >= 20);
        sell.getLive(this);
    }
}
