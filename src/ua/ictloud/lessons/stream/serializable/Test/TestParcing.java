package ua.ictloud.lessons.stream.serializable.Test;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 04-Jun-18.
 */
public class TestParcing implements Serializable{
    private int number;
    private List<TestCar>parking;


    public TestParcing(int number, List<TestCar> parking) {
        this.number = number;
        this.parking = parking;
    }



    @Override
    public String toString() {
        return "TestParcing{" +
                "number=" + number +
                ", parking=" + parking +
                '}';
    }
}
