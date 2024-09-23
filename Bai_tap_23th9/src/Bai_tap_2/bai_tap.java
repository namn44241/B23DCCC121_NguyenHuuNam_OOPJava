package Bai_tap_2;

import java.util.Scanner;

public class bai_tap {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            long N = scanner.nextLong();
            
            long sum = (N * (N + 1)) / 2;
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
