//Bài toán: Quản lý học sinh và lớp học
//Xây dựng một hệ thống đơn giản quản lý học sinh và lớp học. Mỗi học sinh sẽ thuộc về một lớp
//học cụ thể, và lớp học có danh sách các học sinh của mình.
//Yêu cầu:
//1. Tạo lớp Student (Học sinh) với các thuộc tính cơ bản như tên, tuổi và phương thức hiển thị
//thông tin học sinh.
//2. Tạo lớp Classroom (Lớp học) với thuộc tính tên lớp và một danh sách các học sinh.
//3. Lớp học có thể thêm học sinh vào danh sách và hiển thị thông tin của tất cả học sinh trong lớp.


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