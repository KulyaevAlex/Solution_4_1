package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    /**
     * Минимальный возраст студента
     */
    public static final int MIN_AGE = 18;

    public static void main(String[] args) {
        Student student1 = new Student("Петр Волков", 20, 4.6, "420");
        Student student2 = new Student("Мария Губина", 19, 4.1, "420");
        Student student3 = new Student("Ян Варин", 17, 3.7, "421");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            student.printInfo();
        }
        System.out.println();

        for (Student student : students) {
            System.out.println("Студент " + student.getName() + " " + (student.isExcellent(student) ? "является отличником" : "не является отличником"));
        }
        System.out.println();

        for (Student student : students) {
            System.out.println("Возраст студента " + student.getName() + " " + (student.canGraduate(MIN_AGE) ? "не меньше минимального" : "меньше минимального"));
        }
    }
}
