package ua.ictloud.lessons.multithread.test;


/**
 * Created by student on 14-May-18.
 */
public class TestMain {
    public static void main(String[] args) {
        TestM1 m1 = new TestM1();
        TestM2 m2 = new TestM2();
        Thread thm2 = new Thread(m2);
        m1.setName("Thread");
        thm2.setName("Runnable");
        m1.start();
        thm2.start();
        try {
            m1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main");
    }

}
