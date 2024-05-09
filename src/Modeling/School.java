package Modeling;
import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getStudents() {
        return students;
    }
    public String getName() {
        return name;
    }
}