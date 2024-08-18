package University.Faculty;

public class faculty {
    private String name;
    private String facultyId;
    private String department;

    public faculty(String name, String facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getDepartment() {
        return department;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}