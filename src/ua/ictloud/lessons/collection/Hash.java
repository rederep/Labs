package ua.ictloud.lessons.collection;

import java.util.*;

/**       HashSet         LinkedHashSet    TreeSet
 * Created by student on 07-May-18. одинаковые не пишуться, т.к. проверяется по ХешКоду
 */
public class Hash {
    public static void main(String[] args) {
        Set<PersenHash> s1 = new HashSet<>();       //  Разный порядок,
        s1.add(new PersenHash("Ivan"));
        s1.add(new PersenHash("Vova"));
        System.out.println(s1.add(new PersenHash("Oleg")));
        System.out.println(s1.add(new PersenHash("Oleg")));         //нужно переопределить HashCode and Equals чтобы знал как проверять одинаковость
        System.out.println(s1.add(null));
        System.out.println(s1.add(null));
        System.out.println(s1);
        System.out.println();

        Set<PersenHash> s2 = new LinkedHashSet<>();     //Порядок сохраняется
        s2.add(new PersenHash("Ivan"));
        s2.add(new PersenHash("Vova"));
        s2.add(new PersenHash("Oleg"));
        s2.add(new PersenHash("Oleg"));
        s2.add(null);
        s2.add(null);
        System.out.println(s2);
        System.out.println();

        Set<PersenHash> s3 = new TreeSet<>(new Comparator<PersenHash>() {              //Бинарное дерево СОРТИРОВКА,  НУЖЕН КОМПОРАТОР!!, null НЕЛЬЗЯ, Очень медленный
            @Override
            public int compare(PersenHash o1, PersenHash o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        s3.add(new PersenHash("Ivan"));
        s3.add(new PersenHash("Vova"));
        s3.add(new PersenHash("Oleg"));
        s3.add(new PersenHash("Oleg"));
        System.out.println(s3);
        s3.add(new PersenHash("Alexey"));
        s3.add(new PersenHash("Voland"));
        s3.add(new PersenHash("Bernand"));

        System.out.println(s3);
    }

}
