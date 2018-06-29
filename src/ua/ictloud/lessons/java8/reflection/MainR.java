package ua.ictloud.lessons.java8.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Class - почти высший общий Class но не  Object

public class MainR {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class c = null;
        try {
            c = Class.forName("ua.ictloud.lessons.java8.reflection.RT");
            System.out.println(c.getName());
            System.out.println(c.getSimpleName());
            for (Field field : c.getDeclaredFields()) {
                System.out.println(field);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
// упрощенный вызов
        Class c2 = RT.class;
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
        for (Field field : c2.getDeclaredFields()) {
            System.out.println(field);
        }
        System.out.println();
        for (Method method : c2.getDeclaredMethods()) {
            System.out.print("method: " + method.getName() + " --- have next annotations:\t");
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                System.out.println(annotation);
            }
        }
        System.out.println();
        System.out.println();

//добираемся до переменной через рефлексию
        RT r = new RT();
        Field field = r.getClass().getDeclaredField("a");             //через рефлексию задали
     //   Field field = RT.class.getDeclaredField("a");
        field.setAccessible(true);
        field.set(r, 66);
        System.out.println(r.getA());               //через geter получили


    }
}
