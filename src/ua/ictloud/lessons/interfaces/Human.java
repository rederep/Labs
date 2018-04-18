package ua.ictloud.lessons.interfaces;

/**
 * Created by student on 18-Apr-18.
 */
public class Human extends People implements AllInterface {


 /*   @Override                                                          //Берем move  у папки
    public void move() {
        System.out.println("Human move " + speed + "km/h");
    }
*/

    @Override
    public void sell() {
        System.out.println("Human sold own brain");
    }
}
