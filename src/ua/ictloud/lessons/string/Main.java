package ua.ictloud.lessons.string;

/**
 * Created by student on 20-Apr-18.   Строковый класс String
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World Academy";
        String str3 = str1 + str2;
        System.out.println(str3);
        String str4 = str1.concat(str2);
        System.out.println(str4);
        System.out.println(str1);
        System.out.println();

        char s0 = str3.charAt(0);  //ищем символ в 0 массиве
        System.out.println(s0);
        String sunString1 = str3.substring(6);
        System.out.println(sunString1);
        sunString1 = str3.substring(6, 11);  //начало и конец куска
        System.out.println(sunString1);
        System.out.println();

        int index = str3.indexOf("el");  //позиция индекса с начала
        System.out.println(index);
        System.out.println(str3.lastIndexOf("e"));  //позиция индекса с конца
        System.out.println(str3.lastIndexOf("x"));    // не находи = -1
        System.out.println(str3.indexOf('r'));    // поиск по char
        System.out.println(str3.indexOf('e', 2));    // ищем со 2 поз
        System.out.println();

        System.out.println(str3.isEmpty());  //проверка на пустоту
        System.out.println("".isEmpty());
        System.out.println(" Hel lo ".trim());  // обрезаем пробелы слева и справа
        System.out.println(" ".trim().isEmpty());
        System.out.println(" Hello World".trim().replaceAll("Hello", "FuckOf"));   //замена
        System.out.println(" Hello World".trim().toUpperCase());   //Верхний регисть
        System.out.println(" Hello World".trim().toLowerCase());   //нижний регисть
        System.out.println();

        System.out.println("Hello".equals("Hello"));        //проверка строк
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".toLowerCase().equals("hello".toLowerCase()));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println();

        System.out.println("Hello".startsWith("He"));   //начинается ли строка с...
        System.out.println("Hello".startsWith("he"));
        System.out.println("Hello".endsWith("lo"));     //заканчивается ли строка с...

        char[] chars = "I am GRooD".toCharArray(); // строку в массив char
        for (char aChar : chars) {
            //  System.out.print(aChar);
            if (aChar >= 65 && aChar <= 90) {
                System.out.println(aChar + " - upper Case");
            } else {
                System.out.println(aChar + " - lower Case");
            }
        }
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            temp[chars.length - i - 1] = chars[i];
        }
        System.out.println(new String(temp));
    }
}
