package B12.J01009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        long ans = 0;
        long[] f = new long[22];
        f[0]=1;
        for(int i=1; i<=n ; i++){
            f[i]=f[i-1]*i;
            ans+=f[i];
        }
        System.out.print(ans);
        reader.close();
    }
    
}
