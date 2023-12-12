package _7eksamensbevis;

public class Main {

    public static void main (String [] args) {

        Diploma diploma = new Diploma("Ømer");

        Course english = new Course("English", "10");
        Course math = new Course("Math", "7");

        diploma.addCourse(english);
        diploma.addCourse(math);

        System.out.println(diploma);


    }
}
