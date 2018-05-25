package ua.ictloud.lessons.multithread.blockingqueue;


import java.util.concurrent.BlockingQueue;

/**
 * Created by student on 25-May-18.   слушатель
 */
public class Consumer implements Runnable {


    private final BlockingQueue<Long> queue;

    public Consumer(BlockingQueue<Long> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                consume(queue.take());
                System.out.println("Consumer");
            }
        } catch (InterruptedException e) {

        }

    }

    void consume(Long dd) {
        System.out.println(dd);
    }
}
