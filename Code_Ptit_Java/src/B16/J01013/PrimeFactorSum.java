package B16.J01013;

import java.util.*;

public class PrimeFactorSum {
    static final int MAX = 2000001;
    static int[] spf = new int[MAX];
    static int[] primeSumFactors = new int[MAX];

    static void sieve() {
        for (int i = 2; i < MAX; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                for (long j = (long)i * i; j < MAX; j += i) {
                    if (spf[(int)j] == 0) spf[(int)j] = i;
                }
            }
        }
    }

    static void precomputePrimeSumFactors() {
        for (int i = 2; i < MAX; i++) {
            int num = i;
            int sum = 0;
            while (num > 1) {
                sum += spf[num];
                num /= spf[num];
            }
            primeSumFactors[i] = sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sieve();
        precomputePrimeSumFactors();

        int N = scanner.nextInt();
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            totalSum += primeSumFactors[num];
        }

        System.out.println(totalSum);
        scanner.close();
    }
}