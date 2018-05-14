package ua.ictloud.lessons.multithread;

import java.util.Random;

/**
 * Created by student on 14-May-18.  Наследуемся от МультиКласса Thread. Необходимо переопределить run()
 */
public class Mult1 extends Thread {
    private Thread thread;
    public Mult1(){

    }
    public Mult1(Thread thread) {   //передаем поток
        this.thread = thread;
    }

    @Override
    public void run() {
        if (thread!=null){                  //проверяем если какойто паток, если нет запускаем, передаем поток
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("№" + i +  " " + getName() + "  ");  //имя потока
    //        System.out.print("  id: " + getId());                 //id потока

            try {
                Thread.sleep(new Random().nextInt(1000));                 //задержка от 0 до 1 сек, нужно в try/cathc
            } catch (InterruptedException e) {
               // e.printStackTrace();
                System.out.println(getName() + " interrupted" );    //для завершения потока какято обработка
                return;                                             //выход из нашего потока
            }
        }
        System.out.println(getName() + " ended!");
    }
}
