//Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau: 
//	-x: double
//	- y: double
//	+ Point()
//	Point
//	+ Point(x: double, y: double)
//	+ Point(p: Point)
//	+ getX(): double
//	+ getY(): double
//	+ distance(secondPoint: Point): double
//	+distance(p1: Point, p2: Point): double
//	+toString() String
//	Tọa độ x
//	Tọa độ y
//	Tạo đối tượng mặc định
//	Tạo đối tượng có tọa độ trong tham số
//	Tạo đối tượng là bản sao của đối tượng
//	trong tham số
//	Trả về tọa độ X
//	Trả về tọa độ Y
//	Trả về khoảng cách từ điểm này tới điểm
//	thứ hai
//	Trả về khoảng cách giữa hai điểm
//	Chuyển một đối tượng về dạng xâu ký tự,
//	ghi đè phương thức toString().
//	
//Viết chương trình nhập 3 điểm p1, p2, p3. Hãy tính chu vi tam giác được tạo bởi 3 điểm đó.
//
//	Input
//
//	Dòng đầu ghi số bộ test, không quá 10
//	Mỗi bộ test ghi trên 1 dòng 6 số thực có giá trị tuyệt đối không quá 1000 lần lượt là tọa độ của 3 điểm. 
//	Output
//
//	Nếu 3 điểm không thể tạo thành tam giác thì in ra INVALID
//	Nếu 3 điểm tạo thành 1 tam giác thì in ra chu vi của tam giác đó, làm tròn đến 3 chữ số phần thập phân.

package Bai_5_Chu_vi_tam_giac;

import java.util.Scanner;

class Point {
    private double x, y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số bộ test

        while (t-- > 0) {
            Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            if (isValidTriangle(a, b, c)) {
                double perimeter = a + b + c;
                System.out.printf("%.3f\n", perimeter);
            } else {
                System.out.println("INVALID");
            }
        }

        scanner.close();
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }
}