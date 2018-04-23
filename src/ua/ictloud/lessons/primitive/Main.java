package ua.ictloud.lessons.primitive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by student on 23-Apr-18.  L 2.10  Примитивные обертки
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer num = new Integer(55555);
        System.out.println(a);
        System.out.println(num);
        System.out.println(num.doubleValue());
        System.out.println(num.shortValue());
        System.out.println(Integer.MAX_VALUE);    //статические методы класса
        System.out.println(Integer.max(8,1));
        System.out.println(Integer.parseInt("777"));  //со строки в число
        System.out.println(Integer.toBinaryString(a));  //преоброзование в разные системы исчесллений
        System.out.println();

        // КЕШ -127 до 128  в Классе Integer. поэтому true  1Byte!!
        Integer i1 = 127;           //автобоксинг
        Integer i2 = 127;           //автобоксинг
        System.out.println(i1==i2);
        i1 =128;
        i2 =128;
        System.out.println(i1==i2);
        Integer i3 = new Integer(127);  //новый обьекть - поэтому не кеш
        System.out.println(i1==i3);
        System.out.println();
        System.out.println(Character.isDigit('3'));
        Character[] c = {'c','j','g','d','f','a'};
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);                                       //!!!! +: можно добавить Компоратор, перегрузку использовать
  /*      Arrays.sort(c, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return 0;
            }
        });  */
        System.out.println(Arrays.toString(c));
        System.out.println();

        char[] nums = String.valueOf(12345).toCharArray();   //строка в масив чисел
        System.out.println();
        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integers[i]=Integer.valueOf(String.valueOf(nums[i]));
            System.out.print(integers[i]);
        }

    }
}
