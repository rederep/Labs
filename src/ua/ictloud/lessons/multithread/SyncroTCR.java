package ua.ictloud.lessons.multithread;

import java.util.Collection;
import java.util.Queue;

/**
 * Created by student on 14-May-18.
 */
public class SyncroTCR extends Thread {
    private Queue<Integer> collection;

    public SyncroTCR(Queue<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (collection.size() > 0) {
                Integer fileNumber = collection.poll();
                //  System.out.println(collection);
                System.out.println("A am printing " + fileNumber);
            //    collection.add(9);
                try {
                    Thread.sleep(6666);
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println("I have printed file " + fileNumber +
                        "\nCurent size is " + collection.size());
            }
            else
            {
                System.out.println("Waiting for files...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
