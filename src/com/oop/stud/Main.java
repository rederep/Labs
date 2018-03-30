package com.oop.stud;

import java.util.Scanner;

/**
 * Created by student on 28-Mar-18.
 */
public class Main {
    public static void main(String[] args) {
        StudentWork studentWork = new StudentWork();
        Student student = studentWork.createStudentFromConsole();
        studentWork.showSuccesMessage(student);

    }
}
