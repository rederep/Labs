package ua.ictloud.lessons.ptest;

/**
 * Created by student on 16-Apr-18.   ЯВНЫЙ CAST Преобр озование
 */
public class Main {
    public static void main(String[] args) {
        SportCar sc = new SportCar("");
        Car c = new Car("");
        Car csc = new SportCar("");

       // SportCar scs = (SportCar) new Car(); // восходящее преобразование
      //  System.out.println(scs.toString()); // ОШИБКА


        Object o = new SportCar("");
        SportCar ss = (SportCar) o;
        SportCar ss2 = (SportCar) o;

        Object ooo = new Car("Popel");
        Car ooo2 = (Car) o;
        System.out.println(ooo2.getName().toString());


        System.out.println(sc.getClass());

      //  sc.equals(c); // ОШИБКА

       // c.equals(csc);

    }
}
