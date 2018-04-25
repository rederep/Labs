package ua.ictloud.lessons.exception;

/**
 * Created by student on 25-Apr-18.  ASSERT     исключения для отладки
 */
public class MainAssert {
    public static void main(String[] args) {
        int x= 10;
        int y = 10;
        assert x==y;
    //    assert (x+1)==y;
        assert (x+1)==y:"LOLOLOLOLOLOLO";
        System.out.println("End");
    }
}
