package com.oop.univerextends;

/**
 * Created by student on 13-Apr-18.
 */
public class Human {
    private String name;
    private String fullName;
    private int age;


    public void show(){
        System.out.println("I am Human");
    }

    public Human() {

    }

    public Human(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return fullName != null ? fullName.equals(human.fullName) : human.fullName == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age;
    }
}
