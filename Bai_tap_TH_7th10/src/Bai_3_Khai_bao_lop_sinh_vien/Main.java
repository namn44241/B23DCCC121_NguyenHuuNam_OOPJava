//Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: 
//Mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float). 
//Hàm khởi tạo không có tham số, 
//gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0).
//
//Đọc thông tin 1 sinh viên từ bàn phím (không có mã sinh viên) và in ra màn hình. 
//Trong đó Mã SV được gán là B20DCCN001. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy.
//
//Input
//
//Gồm 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA.
//
//Trong đó:
//
//Họ tên không quá 30 chữ cái.
//Lớp theo đúng định dạng thường dùng ở PTIT
//Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.
//Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy. 
//Output
//
//Ghi thông tin sinh viên trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.


package Bai_3_Khai_bao_lop_sinh_vien;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.diemGPA = 0.0f;
    }

    public void nhapThongTin(Scanner scanner) {
        this.maSV = "B20DCCN001";
        this.hoTen = scanner.nextLine();
        this.lop = scanner.nextLine();
        this.ngaySinh = chuanHoaNgaySinh(scanner.nextLine());
        this.diemGPA = scanner.nextFloat();
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = inputFormat.parse(ngaySinh);
            return outputFormat.format(date);
        } catch (ParseException e) {
            return ngaySinh; 
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, diemGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.nhapThongTin(scanner);
        System.out.println(sv);
        scanner.close();
    }
}