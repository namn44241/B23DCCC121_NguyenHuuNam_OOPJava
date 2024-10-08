//Bài 2: Tính chu vi và diện tích hình chữ nhật theo nguyên tắc lập trình hướng 
//đối tượng
//Mục tiêu: Làm quen với việc tạo lớp, thuộc tính, phương thức, và khởi tạo đối 
//tượng. 
//Yêu cầu: Viết lại chương trình ở Bài 1 theo nguyên tắc lập trình hướng đối tượng.
//- Tạo lớp Rectangle với hai thuộc tính: width (chiều rộng) và height (chiều cao).
//- Tạo các phương thức:
//+ getPerimeter(): Tính chu vi hình chữ nhật.
//+ getArea(): Tính diện tích hình chữ nhật.
//- Khởi tạo đối tượng từ lớp Rectangle và hiển thị kết quả (lưu ý chỉ cần khởi tạo 
//đối tượng, không cần nhập từ tham số dòng lệnh hoặc yêu cầu người dùng nhập)

package Bai_tap_2;

public class Bai_tap {
	static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getPerimeter() {
            return 2 * (width + height);
        }

        public int getArea() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Chu vi: " + rect.getPerimeter());
        System.out.println("Diện tích: " + rect.getArea());
    }
}
