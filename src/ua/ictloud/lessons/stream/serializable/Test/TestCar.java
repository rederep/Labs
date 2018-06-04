package ua.ictloud.lessons.stream.serializable.Test;

import java.io.Serializable;

/**
 * Created by student on 04-Jun-18.
 */
public class TestCar implements Serializable {
    private String color;
    private int dateCreate;
    private int maxSpeed;
    private transient int numberPassage;

    public TestCar(String color, int dateCreate, int maxSpeed, int numberPassge) {
        this.color = color;
        this.dateCreate = dateCreate;
        this.maxSpeed = maxSpeed;
        this.numberPassage = numberPassge;
    }

    @Override
    public String toString() {
        return "TestCar{" +
                "color='" + color + '\'' +
                ", dateCreate=" + dateCreate +
                ", maxSpeed=" + maxSpeed +
                ", numberPassage=" + numberPassage +
                '}';
    }
}
