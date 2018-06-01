package ua.ictloud.lessons.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 01-Jun-18.         читаем и пишем по символу
 */
public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("out.txt");
            int c;
            while ((c = in.read()) != -1) {          //читаем чо с файла по символу
                System.out.println((char)c);
                 out.write(c);                       //записвает в стрим файла
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
