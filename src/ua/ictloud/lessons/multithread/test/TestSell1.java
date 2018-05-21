package ua.ictloud.lessons.multithread.test;

/**
 * Created by student on 21-May-18.
 */
public class TestSell1 extends Thread {
    private TestSellColl sell;


    public TestSell1(TestSellColl sell) {
        this.sell = sell;
    }

    @Override
    public void run() {
        do {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (sell) {
                sell.setSell(sell.getSell() - 50);
                System.out.println("-50ua, bank = " + sell.getSell() + "   " + this.getName());
            }
        } while (sell.getSell() >= 20);
        sell.getLive(this);
    }
}
