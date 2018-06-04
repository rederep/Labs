package ua.ictloud.lessons.stream.serializable.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 04-Jun-18.
 */
public class TestMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TestCar ts = new TestCar("Red", 1988, 352, 3);
        try {
            new ObjectOutputStream(new FileOutputStream("Car.ser")).writeObject(ts);
        } catch (IOException e) {
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Car.ser"));
        ts = (TestCar) ois.readObject();
        ois.close();
        System.out.println(ts);


        List<TestCar> arrCar1 = new ArrayList<>();
        arrCar1.add(ts);
        arrCar1.add(new TestCar("Green", 200, 125, 3));
        arrCar1.add(new TestCar("Blue", 1980, 115, 2));
        List<TestCar> arrCar2 = new ArrayList<>();
        arrCar2.add(ts);
        arrCar2.add(new TestCar("Green", 200, 125, 3));
        arrCar2.add(new TestCar("Blue", 1980, 115, 2));


        List<TestParcing> arrParcing = new ArrayList<>();
        arrParcing.add(new TestParcing(3, arrCar1));
        arrParcing.add(new TestParcing(3, arrCar2));


        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("CarParking.ser"));
        oos2.writeObject(arrParcing);
        oos2.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("CarParking.ser"));
        ois.close();
        System.out.println(ois2.readObject());


    }
}
