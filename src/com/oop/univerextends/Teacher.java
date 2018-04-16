package com.oop.univerextends;

/**
 * Created by student on 13-Apr-18.
 */
public class Teacher extends Human {
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, String fullName, int age, double salary) {
        super(name, fullName, age);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() +
                " salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        if (!super.equals(o)) return false;

        Teacher teacher = (Teacher) o;

        return Double.compare(teacher.salary, salary) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}