//Bài 3: Tính chu vi và diện tích hình tròn
//Mục tiêu: Làm quen với phương thức getter và setter, sử dụng hằng số PI trong thư 
//viện Math của Java.
//Yêu cầu:
//- Tạo lớp Circle với thuộc tính radius (bán kính).
//- Tạo các phương thức:
//+ getPerimeter(): Tính chu vi hình tròn.
//+ getArea(): Tính diện tích hình tròn.
//+ Sử dụng hằng số PI khi tính toán
//- Cung cấp phương thức getter và setter để truy vấn dữ liệu và cập nhật dữ liệu 
//cho thuộc tính radius.
//- Bổ sung kiểm tra radius là số nguyên dương trước khi set
//- Bổ sung kiểm tra tương tự với width, height của lớp Rectangle, chuyển hàm kiểm 
//tra ra thành 1 phương thức tĩnh (static) trong 1 lớp chung là Common. Cập nhật 
//lại cách kiểm tra trong các lớp Rectangle và Circle

package Bai_tap_3;

class Common {
    public static boolean isPositive(int value) {
        return value > 0;
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (Common.isPositive(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Chiều rộng phải là số nguyên dương.");
        }
    }

    public void setHeight(int height) {
        if (Common.isPositive(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều cao phải là số nguyên dương.");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public void setRadius(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương.");
        }
    }

    public int getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Bai_tap_3 {
    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(5, 3);
            System.out.println("Hình chữ nhật:");
            System.out.println("Chu vi: " + rect.getPerimeter());
            System.out.println("Diện tích: " + rect.getArea());

            Circle circle = new Circle(4);
            System.out.println("\nHình tròn:");
            System.out.println("Chu vi: " + String.format("%.2f", circle.getPerimeter()));
            System.out.println("Diện tích: " + String.format("%.2f", circle.getArea()));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}