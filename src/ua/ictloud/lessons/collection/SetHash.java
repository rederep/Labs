package ua.ictloud.lessons.collection;

import java.util.*;

/**
 * HashSet         LinkedHashSet    TreeSet     Нильзя уменьшать (тримтусайз), нужно пересоздатовать икопировать
 * Created by student on 07-May-18. одинаковые не пишуться, т.к. проверяется по ХешКоду
 */
public class SetHash {
    public static void main(String[] args) {
        Set<PersenHashTest> s1 = new HashSet<>();       //  Разный порядок,
        s1.add(new PersenHashTest("Ivan"));
        s1.add(new PersenHashTest("Vova"));
        System.out.println(s1.add(new PersenHashTest("Oleg")));
        System.out.println(s1.add(new PersenHashTest("Oleg")));         //нужно переопределить HashCode and Equals чтобы знал как проверять одинаковость
        System.out.println(s1.add(null));
        System.out.println(s1.add(null));
        System.out.println(s1);
        System.out.println();

        Set<PersenHashTest> s2 = new LinkedHashSet<>();     //Порядок сохраняется
        s2.add(new PersenHashTest("Ivan"));
        s2.add(new PersenHashTest("Vova"));
        s2.add(new PersenHashTest("Oleg"));
        s2.add(new PersenHashTest("Oleg"));
        s2.add(null);
        s2.add(null);
        System.out.println(s2);
        System.out.println();

        Set<PersenHashTest> s3 = new TreeSet<>(new Comparator<PersenHashTest>() {              //Бинарное дерево СОРТИРОВКА,  НУЖЕН КОМПОРАТОР!!, null НЕЛЬЗЯ, Очень медленный
            @Override
            public int compare(PersenHashTest o1, PersenHashTest o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        s3.add(new PersenHashTest("Ivan"));
        s3.add(new PersenHashTest("Vova"));
        s3.add(new PersenHashTest("Oleg"));
        s3.add(new PersenHashTest("Oleg"));
        System.out.println(s3);
        s3.add(new PersenHashTest("Alexey"));
        s3.add(new PersenHashTest("Voland"));
        s3.add(new PersenHashTest("Bernand"));

        System.out.println(s3);
    }

}
