package com.oop.stud;

/**
 * Created by student on 28-Mar-18.
 */
public class Student {
    private String firstName;
    private int age;

    public Student(){

    }

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
