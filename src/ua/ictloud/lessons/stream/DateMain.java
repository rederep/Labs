package ua.ictloud.lessons.stream;

import java.io.*;

/**
 * Created by student on 01-Jun-18.    Храним дату в примере  */
public class DateMain {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(               //необходимо вызывать потом метод .flush
                    new FileOutputStream("out.dat")));
            out.writeUTF("Hello");
            out.write(123);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
