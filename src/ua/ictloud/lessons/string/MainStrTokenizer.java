package ua.ictloud.lessons.string;

import java.util.StringTokenizer;

/**
 * Created by student on 20-Apr-18. StringTokenizer   разделить встявляем в определенном месте, по умолчанию пробел
 */
public class MainStrTokenizer {
    public static void main(String[] args) {
        String str = "My name is Vova, and i am crut";
        System.out.println(str);

        StringTokenizer strT = new StringTokenizer(str);
        while (strT.hasMoreElements()) {
            System.out.print(strT.nextElement() + " X ");
        }
        System.out.println();
        StringTokenizer strT2 = new StringTokenizer(str, ",");
        while (strT2.hasMoreElements()) {
            System.out.print(strT2.nextElement() + " X ");
        }
    }
}
