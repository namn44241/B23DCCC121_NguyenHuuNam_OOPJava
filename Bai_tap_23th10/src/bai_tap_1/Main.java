package bai_tap_1;

abstract class Employee {
 protected String name;
 protected int age;
 protected double salary;

 public Employee(String name, int age) {
     this.name = name;
     this.age = age;
     this.salary = 0;
 }

 public abstract void calculateSalary();

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public double getSalary() {
     return salary;
 }
}

class OfficeEmployee extends Employee {
 private static final double DAILY_WAGE = 100; // Lương mỗi ngày
 private int workingDays;

 public OfficeEmployee(String name, int age, int workingDays) {
     super(name, age);
     this.workingDays = workingDays;
 }

 @Override
 public void calculateSalary() {
     this.salary = workingDays * DAILY_WAGE;
 }
}

class TechnicalEmployee extends Employee {
 private double hourlyRate;
 private int workingHours;

 public TechnicalEmployee(String name, int age, double hourlyRate, int workingHours) {
     super(name, age);
     this.hourlyRate = hourlyRate;
     this.workingHours = workingHours;
 }

 @Override
 public void calculateSalary() {
     this.salary = workingHours * hourlyRate;
 }
}

public class Main {
 public static void main(String[] args) {
     OfficeEmployee officeEmp = new OfficeEmployee("Nguyễn Văn A", 30, 22);
     officeEmp.calculateSalary();

     TechnicalEmployee techEmp = new TechnicalEmployee("Trần Thị B", 25, 15, 176);
     techEmp.calculateSalary();

     System.out.println("Nhân viên văn phòng:");
     printEmployeeInfo(officeEmp);

     System.out.println("\nNhân viên kỹ thuật:");
     printEmployeeInfo(techEmp);
 }

 private static void printEmployeeInfo(Employee emp) {
     System.out.println("Tên: " + emp.getName());
     System.out.println("Tuổi: " + emp.getAge());
     System.out.println("Lương: " + emp.getSalary());
 }
}