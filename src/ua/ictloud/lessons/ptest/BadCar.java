package ua.ictloud.lessons.ptest;

/**
 * Created by student on 16-Apr-18.
 */
public class BadCar extends Car {
    private int speed;

    public BadCar(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BadCar{" +
                "speed=" + speed +
                '}';
    }
}
