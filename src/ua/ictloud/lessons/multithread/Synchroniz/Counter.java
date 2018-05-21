package ua.ictloud.lessons.multithread.synchroniz;

/**
 * Created by student on 21-May-18.
 */
public class Counter {
    private int count = 0;

    public void increment() {           //синхронизация метода в блоке
        synchronized (this) {
            count++;
        }
        System.out.print("-" + count + "-");
    }

    public synchronized int getCount() {           //синхронизация  метода сохраняются данные четкие
        return count;
    }
}
