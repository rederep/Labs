package ua.ictloud.lessons.collection;

import java.util.*;

/**
 * Created by student on 04-May-18.  ++++   ArrayList быстро получием лбой элемент, ограничен SizeInt,
 * LinkedLiat быстро вставляет, удаляем и в любое место, неограничен
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> mc0 = new ArrayList<>();
        mc0.add("Hello");
        mc0.add("World");
        System.out.println(mc0 + " Size=" + mc0.size());
        mc0.remove("Hello");
        System.out.println(mc0 + " Size=" + mc0.size());
        System.out.println();

        List<String> mc = new ArrayList<>();
        mc.add("111");
        mc.add("222");
        mc.add(0, "333");               //долго, т.к. смещает+1 и переписует весь массив
        System.out.println(mc);
        mc.set(1, "new 111");
        System.out.println(mc);
        mc.remove(1);
        System.out.println(mc);
        System.out.println(mc.get(0));
        System.out.println();

        ArrayList<String> mc1 = new ArrayList<>();
        mc1.trimToSize();                           //уменьшаем размер листа

        List<String> l1 = new LinkedList<>();
        l1.add("WTF");
        System.out.println(l1);
        System.out.println();

        LinkedList<String> li2 = new LinkedList<>();     //двунаправленный связанный список
        //  li2.pop();                            //получаем head (1 эл) и удаляем и выбрасует ошибку если пусто
        li2.addLast("World");
        li2.addFirst("Hello");
        li2.add("My Beathses");
        System.out.println(li2);
        System.out.println(li2.size());
        System.out.println(li2.peek());         //получаем head (1 эл)
        System.out.println(li2.size());
        System.out.println();
        System.out.println(li2.size());
        System.out.println(li2.poll());         //получаем head (1 эл) и удаляем
        System.out.println(li2.size());
        System.out.println();
        System.out.println(li2.size());
        System.out.println(li2.pop());         //получаем head (1 эл) и удаляем и выбрасует ошибку если пусто
        System.out.println(li2.size());

        Deque<String> li3 = new LinkedList<>();

    }
}
