package ua.ictloud.lessons.nestedclass;

/**
 * Created by student on 02-May-18.    Класс в классе   Nested   Внутренний класс не может существовать без внешнего!!!!!!!
 */
public class Main {
    public static void main(String[] args) {
        Ship titanic = new Ship(6.66);
        Ship.Engine engine = titanic.new Engine();

        System.out.println("Nested class:");             //calss in class
        System.out.println(titanic.getWeight());
        System.out.println(engine.getPower());

        titanic.setEngine(engine);                      //соеденяем двидок в корабль
        System.out.println(titanic.toString());
        System.out.println();


        System.out.println("Local class:");
        titanic.doWOrk();                               //локальный класс
        System.out.println();


        System.out.println("Builder:");
        PersonStatic p1 = PersonStatic.newBuilder()   //Патерн Builder

                .setFirstName("Ivan1")
                .setFirstName("Ivan2")
                .setLastName("Ivanov")
                .build();
        System.out.println(p1);

        p1.toBuilder()
                .setMiddleName("Ivanovich");
        //       .build();                     //можно не писать т.к. Builder не static
        System.out.println(p1);

    }
}
