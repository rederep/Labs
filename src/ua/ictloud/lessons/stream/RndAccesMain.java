package ua.ictloud.lessons.stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * чтение и запись в любом месте но массивом БАЙТ, с корректкой
 * Created by student on 01-Jun-18.
 */
public class RndAccesMain {
    public static void main(String[] args) {

        try {
            RandomAccessFile raf  = new RandomAccessFile("out.txt", "rw");    //если обьявить в try то close работает автоматически
            char[] chars = "Hello WOrld".toCharArray();
            byte[] bytes = new byte[chars.length];
            for (int i = 0; i < chars.length; i++) {
                 bytes[i] = (byte) chars[i];
            }
            raf.write(bytes);
            raf.seek(0);                              //корректа на начало файла
            StringBuilder str = new StringBuilder();
            bytes = new byte[5];
            int n = raf.read(bytes, 0, 5);            //возвращает псевдо состояние потока
            for (int i = 0; i < bytes.length; i++) {
                str.append((char) bytes[i]);
            }
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

