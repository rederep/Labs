package ua.ictloud.lessons.comporator;

import java.util.Comparator;

/**
 * Created by student on 18-Apr-18.
 */
public class IntComporator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        int num1 = i1.intValue();
        int num2 = i2.intValue();
        if (num1<num2) {
            return 1;
        } else if (num2<num1){
            return -1;
        } else
        return 0;
    }
}
