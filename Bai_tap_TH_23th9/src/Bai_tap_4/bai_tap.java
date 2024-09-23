package Bai_tap_4;

import java.util.Scanner;

class Point {
    private double x;
    private double y;

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
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class bai_tap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            double distance = Point.distance(p1, p2);
            System.out.printf("%.4f%n", distance);
        }

        scanner.close();
    }
}