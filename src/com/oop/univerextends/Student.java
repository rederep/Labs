package com.oop.univerextends;

/**
 * Created by student on 13-Apr-18.
 */
public class Student extends Human {
    private double mark;


    public Student() {

    }

    @Override
    public void show(){
        System.out.println("I am student");
    }

    public Student(String name, String fullName, int age, double mark) {
        super(name, fullName, age);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return super.toString() +
                " mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return Double.compare(student.mark, mark) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(mark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
