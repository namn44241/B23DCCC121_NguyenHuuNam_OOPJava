//Bài 4: Lớp đa hình cho các loại hình học
//Mục tiêu: Làm quen với tính kế thừa và đa hình trong OOP.
//Yêu cầu:
//- Tạo một lớp Shape với hai phương thức:
//+ getPerimeter(): Tính chu vi.
//+ getArea(): Tính diện tích.
//- Tạo các lớp con Rectangle, Circle kế thừa lớp Shape.
//- Viết chương trình để tính chu vi và diện tích của một Shape bất kỳ được khởi tạo.


package Bai_tap_4;

abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Bai_tap_4 {
    public static void printShapeInfo(Shape shape) {
        System.out.println("Chu vi: " + String.format("%.2f", shape.getPerimeter()));
        System.out.println("Diện tích: " + String.format("%.2f", shape.getArea()));
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Hình chữ nhật:");
        printShapeInfo(rectangle);

        System.out.println("\nHình tròn:");
        printShapeInfo(circle);
    }
}