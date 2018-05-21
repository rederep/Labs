package ua.ictloud.lessons.multithread.test;

/**
 * Created by student on 21-May-18.
 */
public class TestSell2 extends Thread {
    private TestSellColl sell;

    public TestSell2(TestSellColl sell) {
        this.sell = sell;
    }

    @Override
    public void run() {
        do {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (sell) {
                sell.setSell(sell.getSell() - 20);
                System.out.println("-20ua, bank = " + sell.getSell()+ "   " + this.getName());
            }
        } while (sell.getSell() >= 20);
        sell.getLive(this);

    }

}
