package ua.ictloud.lessons.multithread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23-May-18.
 */


public class DoctorThread extends Thread {
    Patient p;
    Semaphore s;

    public DoctorThread(Patient p, Semaphore s) {
        this.p = p;
        this.s = s;
    }

    public DoctorThread() {
    }

    @Override
    public void run() {

        try {
            s.acquire();                                                        //засовываем в симафор
            System.out.println("Doctor started with patient #" + p.number);
            Thread.sleep(4000);
            s.release();                                                        //освобождаем симафор
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doctor ended with patient #" + p.number);
    }
}
