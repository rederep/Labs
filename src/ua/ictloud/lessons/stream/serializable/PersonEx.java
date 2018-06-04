package ua.ictloud.lessons.stream.serializable;

import java.io.Serializable;

/**
 * Created by student on 04-Jun-18.
 */
public class PersonEx implements Serializable {
    private static final long serialVersionUID = -8750173104303024564L;
    protected String firsName;
    protected String lastName;

//    public PersonEx(String firsName, String lastName) {
//        this.firsName = firsName;
//        this.lastName = lastName;
//    }


    public PersonEx() {
    }

    @Override
    public String toString() {
        return "PersonEx{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
