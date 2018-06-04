package ua.ictloud.lessons.stream.serializable;

import java.io.Serializable;

/**
 * Created by student on 04-Jun-18.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 5571275049203925746L;   //в настройках serializable  "Serializable class without SerialVersionUID"
    // и Alt+ENter на классе добавляем UID
    private String firstName;
    private String lastName;
    private transient int age = 1;   //не будет участвовать в сериалезации

    public Student(String firsNAme, String lastNAme, int age) {
        this.firstName = firsNAme;
        this.lastName = lastNAme;
        this.age = age;
    }

//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
