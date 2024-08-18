package University.courses;

import University.Faculty.faculty;

public class Course {
    private String courseName;
    private String courseCode;
    private faculty instructor;

    public Course(String courseName, String courseCode, faculty instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public faculty getInstructor() {
        return instructor;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Instructor: " + instructor.getName());
    }
}