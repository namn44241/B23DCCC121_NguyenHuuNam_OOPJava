package Bai_1_So_lien_ke;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.println(isAdjacentNumber(n) ? "YES" : "NO");
        }

        scanner.close();
    }

    public static boolean isAdjacentNumber(long n) {
        String number = String.valueOf(n);
        
        for (int i = 1; i < number.length(); i++) {
            int diff = Math.abs(number.charAt(i) - number.charAt(i-1));
            if (diff != 1) {
                return false;
            }
        }
        
        return true;
    }
}
