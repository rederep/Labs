package com.oop;

/**
 * Created by student on 28-Mar-18.
 */
public class Main {
    public static void main(String[] args) {
//       Student stdn1 = new Student();
//        stdn1.age=22;
//        stdn1.name="Anni";
//        System.out.println("Name of student is " + stdn1.name +" and it is " + stdn1.age + " old");
//        stdn1.getInfo();

        Car audi = new Car();
        audi.setMaxSpeed(22);
        audi.setModel("Audi");
        audi.seyHello();
        System.out.println(audi.getMaxSpeed()+ " " + audi.getModel());
       // audi.getInfo();

        Car bmw = new Car(555,"BMW");
        bmw.seyHello();

        Car givi = new Car(80,"Givi", "Red");
        givi.seyHello();
        System.out.println(givi.toString());









    }


}
