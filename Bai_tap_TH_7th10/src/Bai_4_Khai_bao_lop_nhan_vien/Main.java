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
