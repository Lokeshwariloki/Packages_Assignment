package University.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<String> enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public String getStudentId() {

        return studentId;
    }

    public void enrollCourse(String courseName) {

        enrolledCourses.add(courseName);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }
}


