package ua.ictloud.lessons.jdbch2.itcloud.model;

import java.util.List;

/**
 * Created by student on 11-Jun-18.
 */
public class Driver {
    public static final String ID = "id";
    public static final String FIRSTNAME = "firs_name";
    public static final String LASTNAME = "last_name";
    public static final String EXP = "exp";
    public static final String CATEGORY = "category";

    private int id;
    private String firstName;
    private String lastName;
    private int exp;
    private StringBuilder category;
    private List<Car> cars;
    public Driver() {
    }

    public Driver(String fertaName, String lastName, int exp, StringBuilder category) {
        this.firstName = fertaName;
        this.lastName = lastName;
        this.exp = exp;
        this.category = category;
    }

    public Driver(String firstName, String lastName, int exp, StringBuilder category, List<Car> cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exp = exp;
        this.category = category;
        this.cars = cars;
    }

    public Driver(int id) {
        this.id = id;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fertaName) {
        this.firstName = fertaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public StringBuilder getCategory() {
        return category;
    }

    public void setCategory(StringBuilder category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", exp=" + exp +
                ", category=" + category +
                ", cars=" + cars +
                '}' + "\n";
    }
}
