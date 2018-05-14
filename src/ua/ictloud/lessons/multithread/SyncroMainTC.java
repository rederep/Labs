package ua.ictloud.lessons.multithread;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * сломано с SyncroTCR и  SyncroTCW - переделывали под файлы
 * Created by student on 14-May-18.
 */
public class SyncroMainTC {
    public static void main(String[] args) {
        ConcurrentLinkedQueue c1 = new ConcurrentLinkedQueue();
        //  Collection<Integer> c1 = new ArrayDeque<>();
        //   c1 = Collections.synchronizedCollection(c1);           //синхронизированная версия колекции
        SyncroTCR read = new SyncroTCR((Queue<Integer>) c1);
        SyncroTCW write = new SyncroTCW((Queue<Integer>) c1);

        write.start();
        read.start();

        try {
            write.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        read.interrupt();
    }
}
