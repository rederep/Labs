package com.oop;

/**
 * Created by student on 28-Mar-18.
 */
public class Car {
    private int maxSpeed;
    private String model;
    private String color;

    public Car() {
        System.out.println("Car was created;");
    }

    public Car(int maxSpeed, String model, String color) {
        this(maxSpeed, model);
        this.color = color;
    }

    public Car(int maxSpeed, String model) {
        this();
        this.maxSpeed = maxSpeed;
        this.model = model;

    }

    public void setMaxSpeed(int maxSpee) {
        if (maxSpee < 0) {
            maxSpeed = 0;
        } else {
            maxSpeed = maxSpee;
        }
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getModel() {
//        return this.model;
//    }

    public void seyHello() {
        System.out.println("Hello, i am " + model + ", my max speed is "
                + maxSpeed + " Color is " + color);
        showMessege();

    }

    private void showMessege(){
        System.out.println("This is a magic");
    }


    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
