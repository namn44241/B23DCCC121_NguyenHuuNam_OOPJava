package bai_tap;

public class Bai_1 {
	public static boolean soTuNhien(String str) {
        try {
            int giatri = Integer.parseInt(str);
            return giatri > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập đúng 2 tham số x và y là các số nguyên dương.");
            return;
        }

        String xInput = args[0];
        String yInput = args[1];

        if (!soTuNhien(xInput) || !soTuNhien(yInput)) {
            System.out.println("Cả hai tham số x và y phải là các số nguyên dương.");
            return;
        }

        int x = Integer.parseInt(xInput);
        int y = Integer.parseInt(yInput);

        int chuVi = 2 * (x + y);
        int dienTich = x * y;

        System.out.println("Chu vi của hình chữ nhật: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật: " + dienTich);
    }
}
