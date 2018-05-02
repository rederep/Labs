package ua.ictloud.lessons.nestedclass;

/**
 * Created by student on 02-May-18.
 */
public class Ship {
    private double weight;
    private Engine engine;          //соеденяем двидок в корабль

    public void doWOrk() {              //локальный класс
         class MyWork {
            private int a;
            void test() {
                a = 4;
                System.out.println("test in do local in the ship");
            }
        }
        MyWork m = new MyWork();
        m.test();
        m.a += 6;
        System.out.println("a+a=" + m.a);
    }


    public class Engine {
        private double power;

        public Engine() {
            power = weight * 123;
        }

        public double getPower() {
            return power;
        }

        @Override
        public String toString() {
            return ", power=" + power;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getWeight() {
        return weight;
    }

    public Ship(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "weight=" + weight
                + engine +
                '}';
    }
}
