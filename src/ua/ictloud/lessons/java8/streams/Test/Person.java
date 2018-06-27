package ua.ictloud.lessons.java8.streams.Test;

public class Person {
    private int age;
    private Male male;

    public Person(int age, Male male) {
        this.age = age;
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Male getMale() {
        return male;
    }

    public void setMale(Male male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", male=" + male +
                '}' + "\n";
    }
}
