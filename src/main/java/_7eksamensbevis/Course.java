package _7eksamensbevis;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String grade;
    private String[] validGrades = {"-3", "00", "02", "4", "7", "10", "12"};

    public Course(String courseName, String grade) {

        this.courseName = courseName;

        for (String s : validGrades) {
            if (grade.equals(s)) {
                this.grade = grade;
                break;
            } else {
                this.grade = "invalid grade input";
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return "Course: " + courseName + " Grade: " + grade;
    }
}
