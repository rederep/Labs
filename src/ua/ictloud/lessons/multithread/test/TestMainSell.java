package ua.ictloud.lessons.multithread.test;

/**
 * Created by student on 21-May-18.
 */
public class TestMainSell {
    public static void main(String[] args) {
        TestSellColl sell = new TestSellColl(1000);
        Thread t1 = new TestSell1(sell);
        Thread t2 = new TestSell2(sell);
        Thread t3 = new TestSell3(sell);
            t1.setName("Home pay");
            t2.setName("Music pay");
            t3.setName("I have a lot of money");

            t1.start();
            t2.start();
            t3.start();




    }

}
