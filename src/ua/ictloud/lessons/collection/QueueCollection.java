package ua.ictloud.lessons.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by student on 07-May-18.  Queue - Первый зашел - первый вышел !!!, нето возхможности обращаться по Index
 * Deque - Queue + в обратном порядке   Заполняется как угодно
 *  .add(null) - НЕЛЬЗЯ пустую очередь, записать мона но получить - ошибка
 */
public class QueueCollection {
    public static void main(String[] args) {
        System.out.println("Однонаправленая очередь:");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(0);
        q1.offer(1);    //add но лучше offer по документации безопасней
        q1.offer(3);
        q1.offer(7);

        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1.remove());
        System.out.println(q1.peek());
        System.out.println(q1.element());
        System.out.println();

        System.out.println("Двунаправленная очередь:");
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(2);
        d1.addFirst(6);
        d1.addLast(99);
   //     d1.addFirst(null);            //error
        System.out.println(d1);
        System.out.println(d1.pollFirst());
        System.out.println(d1.pollFirst());
        System.out.println(d1.pollFirst());
        System.out.println(d1);
    }
}
