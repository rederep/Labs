package ua.ictloud.lessons.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**                                     читааем и пишем по строкам
 * Created by student on 01-Jun-18.
 */
public class FileStrMain {
    public static void main(String[] args) {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("out.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            outputStream.append("! ");           //дописуем в конец        !поток если закрыть не записать
            outputStream.write("1super1", 1,5);   //с какого символа и сколько символов дописуем
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
