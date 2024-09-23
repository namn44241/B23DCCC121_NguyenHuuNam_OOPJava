package Bai_tap;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Học sinh: " + name + ", Tuổi: " + age);
    }
}

class Classroom {
    private String name;
    private List<Student> students;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        System.out.println("Danh sách học sinh của lớp " + name + ":");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

public class main {
    public static void main(String[] args) {
        Classroom class10A = new Classroom("10A");

        Student student1 = new Student("Nguyễn Văn A", 16);
        Student student2 = new Student("Trần Thị B", 15);
        Student student3 = new Student("Lê Văn C", 16);

        class10A.addStudent(student1);
        class10A.addStudent(student2);
        class10A.addStudent(student3);

        class10A.displayAllStudents();
    }
}