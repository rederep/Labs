package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.         CИНГЛТОЛ
 */
public class FigureUtil {
    private static FigureUtil instance;
   // private static FigureUtil instance = new FigureUtil();  //можно и так, но память сразу захавается.
    private FigureUtil() {  //pзапрещаем создание обьекта в Main

    }

    public static FigureUtil getInstance() {
        if (instance == null) {
            instance = new FigureUtil();
            System.out.println("object create");
        }
        return instance;
    }

    public static void printInfo(Figure figure) {
        System.out.println(figure.toString());
    }
}
