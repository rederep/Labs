package ua.ictloud.lessons.collection;

import javafx.util.Pair;

import java.util.*;

/**     HashSet         LinkedHashSet    TreeSet            Нильзя уменьшать (тримтусайз), нужно пересоздатовать икопировать
 * Created by student on 11-May-18.             Интерфейс MAP,  ключ всегда уникальный
 */
public class MapHash {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();   //не сохравняет порядок
        System.out.println(m1.put("k1", 1));         //получаем что в ячейке и потом запискуем
        System.out.println(m1.put("k2", 1));
        System.out.println(m1.put("k3", 3));
        System.out.println(m1.put("k3", 2));
        System.out.println(m1.put("k1", 10));
        System.out.println(m1);
        System.out.println();

        System.out.println(m1.get("k1"));   //get пок лючу
        System.out.println(m1.keySet());  //список ключей
        m1.replace("k1", 101);    //напрямую замена
        m1.replace("k1", 101, 100);    //напрямую замена если старое значение указанное в перегрузку совпадает с условием ("101")
        System.out.println(m1.values());  //список
        System.out.println();

        System.out.println(m1.remove("k1")); //получаем значение и удаляем
        System.out.println(m1);
        System.out.println(m1.remove("k2", 99)); //перегруженный со значением
        System.out.println(m1);
        m1.remove("k2", 1);
        System.out.println(m1);
        System.out.println();

        System.out.println(m1.putIfAbsent("k2", 2));  //вставлятcя только если уникального ключа небыло, не заменяет values страый
        System.out.println(m1);
        System.out.println(m1.putIfAbsent("k3", 33));
        System.out.println(m1);
        System.out.println();

        System.out.println(m1.get("dasdasd"));          //если нет ключа - null
        m1.put(null, null);                              //null такойже уникальный ключ, который идет в List всегда первым
        System.out.println(m1);
        m1.put(null, 1);
        System.out.println(m1);
        System.out.println();

        System.out.println("ITERATOR");
        Iterator<Map.Entry<String, Integer>> i1 = m1.entrySet().iterator();
        while (i1.hasNext()) {
            Map.Entry<String, Integer> e = i1.next();
            System.out.println("Key=" + e.getKey() + " value=" + e.getValue());
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : m1.entrySet()) {                //так лучше
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        //ВЛОЖЕННЫЙ ЛИСТЫ
        List<Map<String, Map<String, Map<String, Pair<Integer, Integer>>>>> p1;         // можно но сложно обрабатывать

        Map<String, List<String>> d1 = new HashMap<>();
        d1.put("Hello", new ArrayList<>());
        d1.put("World", new LinkedList<>());

    }
}
