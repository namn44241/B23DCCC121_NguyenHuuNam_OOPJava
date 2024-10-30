//Bài tập 2: Xây dựng một hệ thống quản lý nhân viên trong một công ty có nhiều loại nhân viên với
//các chức năng khác nhau. Các loại nhân viên bao gồm:
//- Nhân viên văn phòng (OfficeEmployee): Có thể thực hiện chức năng gửi email.
//- Nhân viên kỹ thuật (TechnicalEmployee): Có thể thực hiện chức năng lập trình.
//- Nhân viên bán hàng (SalesEmployee): Có thể thực hiện chức năng bán hàng.
//Yêu cầu: Sử dụng kế thừa bội qua interfaces để mô tả các hành vi của nhân viên. Tạo các interfaces:
//- EmailSender: mô tả chức năng gửi email.
//- Programmer: mô tả chức năng lập trình.
//- Salesperson: mô tả chức năng bán hàng.
//Tạo các lớp OfficeEmployee, TechnicalEmployee, và SalesEmployee kế thừa bội từ các interfaces
//trên. Viết chương trình cho phép sử dụng các chức năng của từng loại nhân viên

package bai_tap_2;

interface EmailSender {
 void sendEmail(String recipient, String subject, String content);
}

interface Programmer {
 void code(String language);
}

interface Salesperson {
 void sell(String product);
}

abstract class Employee {
 protected String name;
 protected int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public abstract void displayInfo();
}

class OfficeEmployee extends Employee implements EmailSender {
 public OfficeEmployee(String name, int id) {
     super(name, id);
 }

 @Override
 public void sendEmail(String recipient, String subject, String content) {
     System.out.println(name + " đang gửi email đến " + recipient + " với chủ đề: " + subject);
 }

 @Override
 public void displayInfo() {
     System.out.println("Nhân viên văn phòng: " + name + ", ID: " + id);
 }
}

class TechnicalEmployee extends Employee implements Programmer {
 public TechnicalEmployee(String name, int id) {
     super(name, id);
 }

 @Override
 public void code(String language) {
     System.out.println(name + " đang lập trình bằng " + language);
 }

 @Override
 public void displayInfo() {
     System.out.println("Nhân viên kỹ thuật: " + name + ", ID: " + id);
 }
}

class SalesEmployee extends Employee implements Salesperson {
 public SalesEmployee(String name, int id) {
     super(name, id);
 }

 @Override
 public void sell(String product) {
     System.out.println(name + " đang bán sản phẩm: " + product);
 }

 @Override
 public void displayInfo() {
     System.out.println("Nhân viên bán hàng: " + name + ", ID: " + id);
 }
}

public class Main {
 public static void main(String[] args) {
     OfficeEmployee officeEmp = new OfficeEmployee("Nguyễn Văn A", 1001);
     TechnicalEmployee techEmp = new TechnicalEmployee("Trần Thị B", 2001);
     SalesEmployee salesEmp = new SalesEmployee("Lê Văn C", 3001);

     officeEmp.displayInfo();
     techEmp.displayInfo();
     salesEmp.displayInfo();

     officeEmp.sendEmail("client@example.com", "Báo cáo hàng tuần", "Nội dung báo cáo...");
     techEmp.code("Java");
     salesEmp.sell("Laptop XYZ");
 }
}