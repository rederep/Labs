package ua.ictloud.lessons.comporator;

import java.util.Comparator;

/**
 * Created by student on 18-Apr-18.
 */
public class Car implements Comparable {
    private int maxSpeed;
    private int years;

    public Car() {

    }

    public int getYears() {
        return years;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", years=" + years +
                '}';
    }


    @Override
    public int compareTo(Object o) {            //не доделалЮ по принципу Компоратора
        return 0;
    }
}
