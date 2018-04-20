package ua.ictloud.lessons.comporator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by student on 18-Apr-18.     Интерфейс КОМПОРАТОР?,    comparable  прочитать!
 *
 */
public class Main{
    public static void main(String[] args) {
        Integer[] array = getArray();
        Comparator comparator = new IntComporator();
String d = new String();
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, comparator);
        System.out.println("Sorted array by down");
        System.out.println(Arrays.toString(array));

        System.out.println();
        Car[] cars = {new Car(22), new Car(55), new Car(11)};
        System.out.println("Original array");
         System.out.println(Arrays.toString(cars));

        System.out.println("Sorted array");  //не доделал хз как (((
        Arrays.sort(cars);



        System.out.println(Arrays.toString(cars));
       Arrays.sort(cars, new Comparator<Car>() {
           @Override
           public int compare(Car o1, Car o2) {
               Car car1 = (Car) o1;
               Car car2 = (Car) o2;
               if (car1.getYears()<car2.getYears()){
                   return 1;
               } else if (car1.getYears()>car2.getYears()) {
                   return -1;
               }else
             return 0;
           }
       });
        System.out.println("Sorted array by down");
        System.out.println(Arrays.toString(cars));







    }

    public static Integer[] getArray() {
        Integer resul[] = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < resul.length; i++) {
            resul[i] = rand.nextInt(10);
        }
        return resul;
    }





}
