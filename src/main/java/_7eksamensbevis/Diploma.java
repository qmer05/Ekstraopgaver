package _7eksamensbevis;

import java.util.ArrayList;

public class Diploma {
    String studentName;
    ArrayList<Course> courses;

    public String getStudentName() {
        return studentName;
    }


    public Diploma(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: ").append(studentName).append("\n");
        for (Course c : courses) {
            sb.append("Course: ").append(c.getCourseName());
            sb.append(" Grade: ").append(c.getGrade()).append("\n");
        }
        return sb.toString();
    }

    // Average grade beregner lavet med for each loop
    public double averageGrade() {
        double totalGrade = 0;
        for (Course c : courses) {
            totalGrade += Double.parseDouble(c.getGrade());
        }
        return totalGrade / courses.size();
    }

    // Average grade beregner lavet med for loop
    public double averageGrade2() {
        double totalGrade = 0;
        for (int i = 0; i < courses.size(); i++) {
            totalGrade += Double.parseDouble(courses.get(i).getGrade());
        }
        return totalGrade / courses.size();
    }

    // Average grade beregner lavet med while loop
    public double averageGrade3(){
        double totalGrade = 0;
        int i = 0;
        while (i < courses.size()){
            totalGrade += Double.parseDouble(courses.get(i).getGrade());
            i++;
        }
        return totalGrade / courses.size();
    }
}
