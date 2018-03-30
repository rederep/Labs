package com.oop.moto;

/**
 * Created by student on 30-Mar-18.
 */
public class MotoWork {
    public void doneColorMoto(Moto moto, String colourNew){
        moto.setColour(colourNew);
    }

    public void doneCheckMoto(Moto moto){
        System.out.println("Moto is good work now"  + moto.toString());
    }

    public int doneTestDriveMoto(Moto moto){
        return  moto.getSpeed();
    }

}
