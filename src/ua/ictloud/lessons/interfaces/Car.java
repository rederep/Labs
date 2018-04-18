package ua.ictloud.lessons.interfaces;

/**
 * Created by student on 18-Apr-18.
 */
public class Car implements AllInterface {


    @Override
    public void move() {
        System.out.println("Car move");

    }

    @Override
    public void sell() {
        System.out.println("Car not sell");
    }
}
