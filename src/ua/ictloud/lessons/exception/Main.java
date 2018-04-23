package ua.ictloud.lessons.exception;

/**
 * Created by student on 23-Apr-18. L 2.10 Отладка ошибок  Cheked(обязателдьные БД, Файлы и т.п.) и Uncheked(не обязательные)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 333};
        int result;
        try {
            System.out.println("Wowowowowowo");
            result = arr[2];
            System.out.println(result);
            result = arr[4];
            return;

        } catch (ArrayIndexOutOfBoundsException e) {        //идем от детей к родителю, или по логике если на одном уровне
            System.out.println(e);
            System.out.println(e.getMessage());
            // return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {                         //всегда зайдем в Finally
            System.out.println("finally");
            result = 0;
        }
        System.out.println(result);
        System.out.println("---------------------");

        //перебросс ошибки throws
        try {
            System.out.println(getValue(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("End lala");
        }
        System.out.println("---------------------");

        //перебросс ошибки throws собственного эксептина
        try {
            System.out.println(getValueMyneExp(3));
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        } catch (ValueException2 e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getValue(int index) throws Exception {
        final int size = 10;
        int[] mas = new int[size];
        if (index == 0) {
            throw new Exception("Wrong number bla-bla");
        }
        return mas[index];
    }


    public static int getValueMyneExp(int index) throws ValueException, ValueException2 {
        final int size = 10;
        int[] mas = new int[size];
        if (index == 0) {
            //    throw new ValueException();
            throw new ValueException("Wrong number ula-la");

        } else if (index == 1) {
            throw new ValueRuntimeException();
        } else throw new ValueException2();
       // return mas[index];
    }
}
