package ua.ictloud.lessons.multithread.volatile_atomic_primitive;

/**
 * Created by student on 23-May-18.
 */
public class MyCounterThread extends Thread {
    MyCounter myCounter;
    int n;

    public MyCounterThread(MyCounter myCounter, int n) {
        this.myCounter = myCounter;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            myCounter.a1++;
            myCounter.a2++;
            myCounter.a3.getAndIncrement();
        }
    }
}
