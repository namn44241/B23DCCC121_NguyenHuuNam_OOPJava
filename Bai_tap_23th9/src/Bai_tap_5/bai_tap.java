package Bai_tap_5;

import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "";
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }

    public String standardizeColor() {
        if (color == null || color.isEmpty()) {
            return "";
        }
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
}

public class bai_tap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        String color = scanner.next();

        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            Rectangle rect = new Rectangle(width, height, color);
            System.out.printf("%.0f %.0f %s%n", 
                rect.findPerimeter(), 
                rect.findArea(), 
                rect.standardizeColor());
        }

        scanner.close();
    }
}