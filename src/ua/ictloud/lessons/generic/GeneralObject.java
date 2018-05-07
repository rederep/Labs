package ua.ictloud.lessons.generic;

import org.omg.CORBA.Object;

/**
 * Created by student on 04-May-18.
 */
public class GeneralObject <T> {
    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
