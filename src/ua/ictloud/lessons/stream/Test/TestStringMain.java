package ua.ictloud.lessons.stream.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by student on 04-Jun-18.
 */
public class TestStringMain {
    public static void main(String[] args) throws IOException {
        TestStringStudent[] tss = new TestStringStudent[3];
        tss[0] = new TestStringStudent("Petrov", "Vasya", 22);
        tss[1] = new TestStringStudent("Uhov", "Igor", 39);
        tss[2] = new TestStringStudent("Nosov", "Den", 15);
        FileWriter fw = new FileWriter("stout.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (TestStringStudent ts : tss) {
            bw.write(ts.toString());
            bw.newLine();
        }

        bw.close();
        fw.close();

        String[] temp = new String[3];
        List<TestStringStudent> listSt = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("stout.txt"));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {         //конец документа возвращает null
            int count = 0;
            StringTokenizer strT = new StringTokenizer(currentLine, "   ");
            while (strT.hasMoreElements()) {
                //  System.out.println(strT.nextElement());
                if (count == 0) {
                    temp[0] = (String) strT.nextElement();
                } else if (count == 1) {
                    temp[1] = (String) strT.nextElement();
                } else {
                    temp[2] =(String) strT.nextElement();
                }
                count++;
                // И ТАК СОЙДЕТ ))))
            }
            listSt.add(new TestStringStudent(temp[0], temp[1],  Integer.parseInt(temp[2])));
            System.out.println();
        }
        for (TestStringStudent student : listSt) {
            System.out.println(student);
        }
    }
}
