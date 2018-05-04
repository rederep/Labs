package ua.ictloud.lessons.generic;

/**
 * Created by student on 04-May-18.   ГЕНЕРИКИ   может быть класс и метод
 */
public class GenericMain {
    private static Integer[] arr = {1, 4, 2, 5};
    public static void main(String[] args) {
        GeneralObject<Integer> g = new GeneralObject<>();
        g.setT(Integer.valueOf(4));
        g.setT(6);
        System.out.println(g.getT());

        GeneralObject<String> g2 = new GeneralObject<>();
        g2.setT("Soso");
        System.out.println(g2.getT());

        GeneralObject g3 = new GeneralObject();                 //не рекомендуется !!!!!!!!!
        g3.setT("GoL");
        System.out.println(g3.getT() + "1");
        String s = (String) g3.getT();                          //прямое преобразование
        System.out.println(s + "2");

//        GOArray.<String>doArray(arr);                       //ошибка
        GOArray.<Integer>doArray(arr);
        GOArray.doArray(arr);

        GOExtends<?> g4 = new GOExtends<Integer>(11);
        System.out.println(g4.getEven());
    }


}
