package ua.ictloud.lessons.java8.lambda;

// Ингтерфейс должен быть функцинальным!! тоесть в интерфейсе только 1 метод

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        TestVoid t = new TestVoid() {
//            @Override
//            public void show() {
//                System.out.println("Hello World");
//                System.out.println("wow");
//            }
//        };
//        t.show();
//
//        TestVoid t1 = () -> {
//            System.out.println("Hello World with lambda");
//            System.out.println("wow");
//        };
//        t1.show();


//        TestVoid ttst = x -> System.out.println("WTF " + x);
//        ttst.show(2);

//        TestVoid ttst = x  -> x*x;
//        System.out.println(ttst.show(2));

        TestVoid ttst = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
            return x + y;
        };
        System.out.println(ttst.show(2, 3));

//---------------------------------------------------------------

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();
        final int[] a = {6};
        list.forEach(integer -> {
            a[0] =5;
            System.out.print(integer);
        });
        System.out.println();
        list.forEach(System.out::print);     // Ссылка на метод
        System.out.println();
//---------------------------------------------------------------

    }
}
