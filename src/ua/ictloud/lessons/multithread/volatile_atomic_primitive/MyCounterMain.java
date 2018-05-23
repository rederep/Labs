package ua.ictloud.lessons.multithread.volatile_atomic_primitive;

/**   Применяеться к примитивам
 * Created by student on 23-May-18.   Volatile нужно синхронизировать, Atomic уже синхранизированный
 */
public class MyCounterMain {
    public static void main(String[] args) {
        MyCounter m1 = new MyCounter();
        MyCounterThread[] tg = new MyCounterThread[100];
        for (int i = 0; i < 100; i++) {
            tg[i]= new MyCounterThread(m1,100000);
            tg[i].start();
        }
        for (MyCounterThread t : tg) {
            try {
                t.join();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("int " + m1.a1);
        System.out.println("vol " + m1.a2);
        System.out.println("atom " + m1.a3.get());

        System.out.println(m1.a3.getAndIncrement());    //инкремент
        System.out.println(m1.a3.get());                //получить
        System.out.println(m1.a3.addAndGet(9));
        System.out.println(m1.a3.getAndAdd(4));
        System.out.println(m1.a3.get());
        System.out.println(m1.a3.doubleValue());       //gthj,hjpjdfnm
    }
}
