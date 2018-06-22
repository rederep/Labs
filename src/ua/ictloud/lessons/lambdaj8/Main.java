package ua.ictloud.lessons.lambdaj8;

// Ингтерфейс должен быть функцинальным!! тоесть в интерфейсе только 1 метод

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

    }
}
