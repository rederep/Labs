package ua.ictloud.lessons.generic;

/**
 * Created by student on 04-May-18.   vметод
 */
public class GOArray {
    public static <T> void doArray(T[] t){
        for (T t1 : t) {
            System.out.print(t1);
        }
    }
}
