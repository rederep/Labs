package ua.ictloud.lessons.java8.streams.Test;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
Male male;
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                male = Male.MAN;
            } else {
                male = Male.WOMAN;
            }
            persons.add(new Person(10 + (i * 8), male));
        }
        persons.forEach(System.out::print);

        System.out.println();
         List<Person> resulPerson = persons.stream()
                 .filter(person -> person.getAge() > 18)
                 .filter(person ->person.getMale()==Male.MAN && person.getAge()<60
                         ||person.getMale()==Male.WOMAN && person.getAge()<55)
                 .collect(Collectors.toList());
        System.out.println(resulPerson);

        System.out.println(resulPerson.size());

    }
}
