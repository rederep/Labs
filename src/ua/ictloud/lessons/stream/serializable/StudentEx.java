package ua.ictloud.lessons.stream.serializable;

/**
 * Created by student on 04-Jun-18.
 */
public class StudentEx extends PersonEx {
    private static final long serialVersionUID = 1567282376194606109L;
    private int age;

    public StudentEx(String firsName, String lastName, int age) {
        super.firsName = firsName;
        super.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentEx{" +
                "age=" + age +
                "} " + super.toString();
    }
}
