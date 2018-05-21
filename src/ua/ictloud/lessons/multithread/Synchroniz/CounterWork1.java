package ua.ictloud.lessons.multithread.synchroniz;

/**
 * Created by student on 21-May-18.   поток
 */
public class CounterWork1 extends Thread {
    private Counter counter;

    public CounterWork1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
      //  synchronized (counter) {                    //синхронизация части кода, выводит в данном примере все четко
            for (int i = 0; i < 1000; i++) {
                System.out.print(getName() + " was " + counter.getCount() + "\t");
                counter.increment();
                System.out.println(" now " + counter.getCount());

         //   }
        }
    }
}
