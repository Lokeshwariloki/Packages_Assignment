import University.student.Student;
import University.courses.Course;
import University.Faculty.faculty;

public class Main {
    public static void main(String[] args) {

        faculty faculty = new faculty("Famitha", "F001", "Computer Science");
        Course course = new Course("Data Structures", "CS801", faculty);
        Student student = new Student("Pawan", "S001");

        student.enrollCourse(course.getCourseName());
        student.displayInfo();
        course.displayInfo();
        faculty.displayInfo();
    }
}