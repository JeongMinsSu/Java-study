package Modeling;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School("백석대학교");

        Student student1 = new Student("홍길동", 1);
        Student student2 = new Student("성춘향", 2);

        school.addStudent(student1);
        school.addStudent(student2);

        List<Student> students = school.getStudents();
        System.out.println( school.getName() + " 학생");
        for (Student student : students) {
            System.out.println("이름: " + student.getName() + ", ID: " + student.getId());
        }
    }
}