package ua.ictloud.lessons.multithread;

/** МНОГОПОТОЧЯНОСТЬ   5 состояний (new-Runnable-(Stop/Pause)-Running-Dead)
 * Created by student on 14-May-18.
 */
public class Main {
    public static void main(String[] args) {
        Mult1 t1 = new Mult1();
        Mult1 t2 = new Mult1();
        Mult1 t3 = new Mult1(t1);           //передаем поток, t2 запускается после потока t1

        Mult2 t4 = new Mult2();
        Mult2 t5 = new Mult2();
        Mult2 t6 = new Mult2();
        Mult2 t7 = new Mult2();

        t1.setName("T1");
        t2.setName("T2");

        t4.setName("T4");
        t5.setName("T5");
        t5.setPriority(1);   //приоритет поток, по ум. 5, (1-10) (10 - макс проритет)
        t6.setName("T6");
        t6.setPriority(10);
        t7.setName("T7");
        t7.setDaemon(true);  //запускается в фоне, выполняется даже если main завершился


        t1.start();             //запуск потока
        t2.start();
        // конструктором, поток в потоке с проверкой
        t3.start();

       System.out.println("main has start");

        try {
            Thread.sleep(500);
            t1.interrupt();                 //прерывание потока (может выкинуть ошибку), обрабатуем по try/catch переменной interrupted
        } catch (InterruptedException e) {
            e.printStackTrace();
         }

        try {
            t1.join();                          //выполнения main пока не выполнится поток t1, обьеденение потоков!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //проверяем приортеты потоков
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        //передаем приоритето потоков
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.interrupt();
        t5.interrupt();
        t6.interrupt();
        t7.interrupt();


        System.out.println("main has ended");
        //t1.start();
        System.out.println();




    }
}
