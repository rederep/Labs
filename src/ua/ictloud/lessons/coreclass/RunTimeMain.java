package ua.ictloud.lessons.coreclass;

/**
 * Created by student on 25-May-18.   получаем системное инфо
 */
public class RunTimeMain {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println(run.freeMemory());
        System.out.println(run.totalMemory());


    }
}
