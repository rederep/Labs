package com.oop.moto;

/**
 * Created by student on 30-Mar-18.
 */
public class Moto {

    private String model;
    private int speed;
    private String colour;
    private int numberKol;


    public Moto(String model, int speed, String colour, int numberKol) {
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.numberKol = numberKol;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", colour='" + colour + '\'' +
                ", numberKol=" + numberKol +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberKol() {
        return numberKol;
    }

    public void setNumberKol(int numberKol) {
        this.numberKol = numberKol;
    }
}
