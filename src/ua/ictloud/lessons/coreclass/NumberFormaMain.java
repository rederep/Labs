package ua.ictloud.lessons.coreclass;

import java.text.NumberFormat;
import java.util.Locale;

/**                                   Меняем формат в зависимости от страны и т.п.
 * Created by student on 25-May-18.
 */
public class NumberFormaMain {
    public static void main(String[] args) {
        int num = 40000000;
        NumberFormat n1 = NumberFormat.getInstance();    //ФОРМАТ ЧИСЕЛ
        System.out.println(n1.format(num));
        NumberFormat n2 = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(n2.format(num));

        NumberFormat n3 = NumberFormat.getCurrencyInstance();   //формат бабла
        System.out.println(n3.format(0));
    }
}
