package com.oop.stud;

import java.util.Scanner;

/**
 * Created by student on 28-Mar-18.
 */
public class StudentWork {
    public Student createStudentFromConsole()
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String firtsName = scan.nextLine();
        System.out.println();
        System.out.print("Enter sudent age: ");
        int age = scan.nextInt();
        return new Student(firtsName, age);
    }

    public void showSuccesMessage(Student student){
        System.out.println("Well done.");
        System.out.println(student.toString());
    }
}
