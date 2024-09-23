package Bai_tap_1;

import java.util.Scanner;

public class bai_tap {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        
        if (length <= 0 || width <= 0 || length > 10000 || width > 10000) {
            System.out.println("0");
        } else {
            int perimeter = 2 * (length + width);
            int area = length * width;
            
            System.out.println(perimeter + " " + area);
        }
        
        scanner.close();
    }
}
