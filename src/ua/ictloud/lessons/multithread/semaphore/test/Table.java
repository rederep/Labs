package ua.ictloud.lessons.multithread.semaphore.test;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23-May-18.
 */
public class Table extends Thread {
    Famely f;
    Semaphore s;

    public Table(Famely f, Semaphore s) {
        this.f = f;
        this.s = s;
    }

    @Override
    public void run() {
        try {
            s.acquire();
            System.out.println("Now eating #" + f.getnFamaly());
            Thread.sleep(2000);
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Eating has done #" + f.getnFamaly());
    }
}
