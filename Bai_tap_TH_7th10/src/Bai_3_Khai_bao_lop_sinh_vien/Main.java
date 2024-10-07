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