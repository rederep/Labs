package ua.ictloud.lessons.multithread.volatile_atomic_primitive;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by student on 23-May-18.     Volatile нужно синхронизировать, Atomic уже синхранизированный
 */
public class MyCounter {
    public int a1;
    public volatile int a2;
    public AtomicInteger a3 = new AtomicInteger(0);
}
