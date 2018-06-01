package ua.ictloud.lessons.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 01-Jun-18.
 */
public class TestMain {
    public static void main(String[] args) {
        FileInputStream in = null;
        StringBuilder str = new StringBuilder();
        try {
            in = new FileInputStream("input.txt");
            int c;
            while ((c = in.read()) != -1) {
                str.append((char) c);
            }
            str.trimToSize();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(str);
    }
}
