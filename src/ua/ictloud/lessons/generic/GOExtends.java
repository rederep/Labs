package ua.ictloud.lessons.generic;

/**
 * Created by student on 04-May-18.   super  - все выше класы+, extends все классы ниже
 */
public class GOExtends<T extends Number> {
    private T t;

    public GOExtends(T t) {
        this.t=t;
        System.out.println(t);
    }

    public int getEven() {
        return t.intValue() % 2;
    }

    public void setT(T t) {
        this.t = t;

    }
}
