//Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
//
//Mã nhân viên: được gán giá trị là 00001
//Họ tên: Xâu ký tự không quá 40 chữ cái.
//Giới tính: Nam hoặc Nu
//Ngày sinh: đúng theo chuẩn dd/mm/yyyy
//Địa chỉ: Xâu ký tự không quá 100 chữ cái
//Mã số thuế: Dãy số có đúng 10 chữ số
//Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
//Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó.
//
//Input
//
//Gồm 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên.
//
//Output
//
//Ghi ra đầy đủ thông tin nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống.


package Bai_4_Khai_bao_lop_nhan_vien;

import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHD;

    public NhanVien() {
        this.maNV = "00001";
    }

    public void nhapThongTin(Scanner scanner) {
        this.hoTen = scanner.nextLine();
        this.gioiTinh = scanner.nextLine();
        this.ngaySinh = scanner.nextLine();
        this.diaChi = scanner.nextLine();
        this.maSoThue = scanner.nextLine();
        this.ngayKyHD = scanner.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", 
                             maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.nhapThongTin(scanner);
        System.out.println(nv);
        scanner.close();
    }
}
