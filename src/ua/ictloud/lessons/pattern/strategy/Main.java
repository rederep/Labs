package ua.ictloud.lessons.pattern.strategy;

/**
 * Created by student on 30-May-18. стратегия, у одного интерфейса может быть немколько реализаций, гибкость управления
 */
public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        r.setContext(new CatSay());
        r.saySomething();

        r.setContext(new DogSay());
        r.saySomething();



    }
}
