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