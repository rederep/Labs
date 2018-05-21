package ua.ictloud.lessons.multithread.synchroniz;

/**
 * Created by student on 21-May-18.  Синхронизайция потока (блокирует)  synchronized
 */
public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new CounterWork1(c1);
        Thread t2 = new CounterWork1(c1);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();

    }

}
