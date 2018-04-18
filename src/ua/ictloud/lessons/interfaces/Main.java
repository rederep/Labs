package ua.ictloud.lessons.interfaces;

/**
 * Created by student on 18-Apr-18.         // ИТНЕТРФЕЙСЫ
 */
public class Main {
    public static void main(String[] args) {
        //  Car car = new Car();
        Movable car = new Car();
        //   car.move();
        //  Movable hum = new Human();
        //    hum.move();

        Movable[] movables = new Movable[2]; //полиморфизм
        movables[0] = car;
        movables[1] = new Human();

        for (Movable movable : movables) {
            movable.move();
        }

        System.out.println();
        AllInterface[] all = new AllInterface[2];
        all[0] = new Car();
        all[1] = new Human();
        for (AllInterface allInterface : all) {
            allInterface.move();
            allInterface.sell();
        }
        System.out.println();
        movables[1].move();


        new Movable(){
            @Override
            public void move() {
                System.out.println("\nMoving is moving");
            }
        }.move();

        System.out.println("__________________________");

        Car c = new Car();
        SomeMoves.makeMove(c);      //вызов интерфейса из обьекта
        Human h = new Human();
        SomeMoves.makeMove(h);


        Movable m = new Movable() {             //несколько раз вызов
            @Override
            public void move() {
                System.out.println("\nOwn is moving");
            }
           };
        SomeMoves.makeMove(m);

        SomeMoves.makeMove(new Movable() {          //вызов 1 раз
            @Override
            public void move() {
                System.out.println("\nAnonymous is moving");
            }
        });



    }
}
