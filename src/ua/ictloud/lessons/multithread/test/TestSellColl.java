package ua.ictloud.lessons.multithread.test;

/**
 * Created by student on 21-May-18.
 */
public class TestSellColl {
    private int sell;

    public TestSellColl(int sell) {
        this.sell = sell;
    }

    public void getLive(Thread t){
        System.out.println("Potok " + t.getName() + " is Dead");
        System.out.println("God Buy");
       // t.interrupt();
        System.exit(1);
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getSell() {
        return sell;
    }
}
