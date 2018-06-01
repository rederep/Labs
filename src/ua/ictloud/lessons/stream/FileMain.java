package ua.ictloud.lessons.stream;

import java.io.File;
import java.io.IOException;

/**
 * работа с инфой файлов папок
 * Created by student on 01-Jun-18.
 */
public class FileMain {
    public static void main(String[] args) {
        File f = new File("input.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canExecute());


        File folder = new File("lalala");
        folder.mkdir();

        File file = new File(folder.getAbsolutePath() + "/lalala.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.setReadOnly();
       file.renameTo(new File("MegaLaLaLa.txt"));   //переместить и переименовать
    }

}
