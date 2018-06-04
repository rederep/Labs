package ua.ictloud.lessons.stream.Test;

/**
 * Created by student on 04-Jun-18.
 */
public class TestStringStudent {
    private String firstName;
    private String lastName;
    private int age;

    public TestStringStudent(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName +
                "   " +
                lastName +
                "   " + age;
    }
}
