package ua.ictloud.lessons.stream;

import java.io.*;

/**
 * Created by student on 04-Jun-18.   работа со строками, читаем по строкам
 */
public class StringMain {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("out.txt");
        BufferedReader br = new BufferedReader(fr);
        String curкentLine;
        while ((curкentLine = br.readLine()) != null) {         //конец документа возвращает null
            System.out.println(curкentLine);
        }
        br.close();
        fr.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write("Hella\n");                                //переход на новую строку
        bw.write("My Ddddos",6,3);
        bw.newLine();                                       //переход на новую строку
        bw.write("Attack");
        bw.close();


        FileReader fr2 = new FileReader("out.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String curкentLine2;
        while ((curкentLine = br.readLine()) != null) {         //конец документа возвращает null
            System.out.println(curкentLine);
        }
        br.close();
        fr.close();

    }
}
