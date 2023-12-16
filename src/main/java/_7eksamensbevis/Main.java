package _7eksamensbevis;

import java.awt.*;

public class Main {

    public static void main (String [] args) {

        Diploma diploma = new Diploma("Ømer");

        Course english = new Course("English", "10");
        Course math = new Course("Math", "7");
        Course chemistry = new Course("Chemistry", "4");
        Course biology = new Course("Biology", "12");

        diploma.addCourse(chemistry);
        diploma.addCourse(biology);
        diploma.addCourse(english);
        diploma.addCourse(math);

        System.out.println(diploma);

        System.out.println("Student: " + diploma.getStudentName() + " Average grade: " + diploma.averageGrade3());

    }
}
