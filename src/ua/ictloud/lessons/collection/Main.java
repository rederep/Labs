package ua.ictloud.lessons.collection;

import java.util.*;

/**
 * Created by student on 04-May-18.  ++++   ArrayList быстро получием лбой элемент, ограничен SizeInt,
 * LinkedLiat быстро вставляет, удаляем и в любое место, неограничен
 * Итераторы
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
        //указатель меняется с методами next, previous
        System.out.println();
        System.out.println("ITERATOR");

        LinkedList<String> li4 = new LinkedList<>();
        li4.add("Hello");
        li4.add("World");
        li4.add(null);
        System.out.println(li4);


        Iterator<String> i1 =  li4.iterator();

        System.out.println("Size:" + li4.size());
        System.out.println(i1.next());
        System.out.println(i1.hasNext());
        System.out.println(i1.next());
        System.out.println(i1.next());
        System.out.println(i1.hasNext());

        System.out.println("\nLIST ITERATOR");
        ListIterator<String> i2 = li4.listIterator(1);   //идем с 1 элемента
        System.out.println(i2.hasNext());
        System.out.println(i2.previous());
        System.out.println(i2.hasPrevious());
        System.out.println(i2.next());
        i2.remove();                            //удаляет в коллекции текущий элемент указателя
        System.out.println(i2.nextIndex());
        System.out.println(i2.next());
        System.out.println(i2.nextIndex());
        System.out.println();

        Iterator<String> i3 = li4.iterator();
        while (i3.hasNext()){
            System.out.print(i3.next()+ "---");
        }



    }
}
