package ua.ictloud.lessons.multithread;

import java.util.Random;

/**
 * Created by student on 14-May-18.  Наследуемся от МультиКласса Thread. Необходимо переопределить run()
 */
public class Mult2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            if (getName().equals("T4")) {
                Thread.yield();                //передаем приорите потока в конец!
            }
            i++;
        }
        System.out.println("Prioir-"+ getName() + " " + i);
    }
}
