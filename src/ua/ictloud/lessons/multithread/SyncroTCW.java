package ua.ictloud.lessons.multithread;

import java.util.Collection;
import java.util.Queue;
import java.util.Random;

/**
 * Created by student on 14-May-18.
 */
public class SyncroTCW extends Thread {
    private Queue<Integer> collection;

    public SyncroTCW(Queue<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        for (int i = 0; i < 50 ; i++) {
            collection.add(rnd.nextInt(50));
            System.out.println("Added file to the print queue");
            try {
                Thread.sleep(rnd.nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
