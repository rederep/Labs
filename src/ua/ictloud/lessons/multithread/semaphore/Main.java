package ua.ictloud.lessons.multithread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * пришло 2, 1 вышел зашел следующий в очереди и так далее, max 2 потока в данном примере
 * .acquire();    Записываем в симафор
 * s.release();   освобождаем симафор
 * Created by student on 23-May-18.
 */
public class Main {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(2);       //кол-во потоков одновременно
        for (int i = 0; i < 10; i++) {
            new DoctorThread(new Patient(i), s).start();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
