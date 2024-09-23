package Bai_tap_3;

import java.util.Scanner;

public class bai_tap {
	static int N, K;
    static int[] combination;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        K = scanner.nextInt();
        
        combination = new int[K];
        
        backtrack(1, 0);
        
        System.out.println("Tong cong co " + count + " to hop");
        
        scanner.close();
    }
    
    static void backtrack(int i, int index) {
        for (int j = i; j <= N - K + index + 1; j++) {
            combination[index] = j;
            if (index == K - 1) {
                printCombination();
                count++;
            } else {
                backtrack(j + 1, index + 1);
            }
        }
    }
    
    static void printCombination() {
        for (int i = 0; i < K; i++) {
            System.out.print(combination[i] + " ");
        }
        System.out.println();
    }
}
