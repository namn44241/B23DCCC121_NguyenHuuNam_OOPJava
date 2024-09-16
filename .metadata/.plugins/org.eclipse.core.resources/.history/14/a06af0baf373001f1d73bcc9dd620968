//Bài tập 5: Hệ thống quản lý các loại hình học
//Mục tiêu: Hiểu về việc quản lý nhiều đối tượng khác nhau và áp dụng tính kế thừa, 
//đa hình.
//Yêu cầu:
//- Tạo một danh sách (ArrayList) chứa các đối tượng Shape khác nhau (Rectangle, 
//Circle). 
//- Viết chương trình để tính tổng diện tích và chu vi của tất cả các hình trong danh 
//sách

package Bai_tap_5;

import java.util.ArrayList;
import java.util.List;

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

public class Bai_tap_5 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 3));
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(2, 7));
        shapes.add(new Circle(3));

        double totalPerimeter = 0;
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
            totalArea += shape.getArea();
        }

        System.out.println("Tổng chu vi của tất cả các hình: " + String.format("%.2f", totalPerimeter));
        System.out.println("Tổng diện tích của tất cả các hình: " + String.format("%.2f", totalArea));
    }
}