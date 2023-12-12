package _7eksamensbevis;

import java.util.ArrayList;

public class Diploma {
    String studentName;
    ArrayList<Course> courses;


    public Diploma(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Studerende: ").append(studentName).append(" ");
        for (Course c : courses) {
            sb.append("Kursus: ").append(c.getCourseName());
            sb.append("Karakter: ").append(c.getGrade());
        }
        return sb.toString();
    }
}
