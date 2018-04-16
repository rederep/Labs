package ua.ictloud.lessons.ptest;

/**
 * Created by student on 16-Apr-18.
 */
public class SportCar  extends Car{
    private boolean isSpouler;

    public SportCar(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "isSpouler=" + isSpouler +
                '}';
    }

}
