package ua.ictloud.lessons.stream.serializable;

import java.io.*;

/**                  Для передачи данных (бд, инет и тп.) целым куском обьекта (в дагнном примере класса Student)
 * Created by student on 04-Jun-18.
 */
public class SerializableMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st1 = new Student("Ivan", "Petrov",22);
        st1.setFirstName("Pupkin");
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st1);
        oos.close();

        Student st2;
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        st2 = (Student)ois.readObject();                                           //преобразовываем обратно Обьект в Student
        System.out.println(st2);
        ois.close();

        // пример с Extends
        StudentEx stEx = new StudentEx("Ivan", "Petrov",22);
        FileOutputStream fosEx = new FileOutputStream("student.ser");
        ObjectOutputStream oosEx = new ObjectOutputStream(fosEx);

        oosEx.writeObject(stEx);
        oosEx.close();

        StudentEx stEx2;
        FileInputStream fisEx = new FileInputStream("student.ser");
        ObjectInputStream oisEx = new ObjectInputStream(fisEx);
        stEx2 = (StudentEx)oisEx.readObject();                                           //преобразовываем обратно Обьект в Student
        System.out.println(stEx2);
        oisEx.close();


    }
}
