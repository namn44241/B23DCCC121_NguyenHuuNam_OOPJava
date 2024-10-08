//	Bài 1: Tính chu vi và diện tích hình chữ nhật cơ bản
//	Mục tiêu: Làm quen ngôn ngữ lập trình Java và các cú pháp cơ bản
//	Yêu cầu:
//	- Viết chương trình Tính chu vi và diện tích của một hình chữ nhật với width (chiều 
//	rộng) và height (chiều cao) nhập từ tham số dòng lệnh
//	- Phải kiểm tra width, height là các số nguyên dương trước khi tính toán.
//	- In kết quả tính toán ra màn hình

package Bai_tap_1;

public class Bai_tap {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập chiều rộng và chiều cao.");
            return;
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width <= 0 || height <= 0) {
                System.out.println("Chiều rộng và chiều cao phải là số nguyên dương.");
                return;
            }

            int chuVi = 2 * (width + height);
            int dienTich = width * height;

            System.out.println("Chu vi: " + chuVi);
            System.out.println("Diện tích: " + dienTich);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số nguyên hợp lệ cho chiều rộng và chiều cao.");
        }
    }
}
