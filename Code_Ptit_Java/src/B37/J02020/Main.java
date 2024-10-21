package B37.J02020;

import java.util.Scanner;
import java.util.Stack;

public class Main{
    static int n, k, cnt=0;
    static void Try(int i, int start, int[] res){
        if(i==k){
            cnt++;
            for(int j=0; j<k; j++){
                System.out.printf("%d ",res[j]);
            }
            System.out.println("");
            return;
        }
        for(int u=start; u<=n-k+i+1 ; u++){
            res[i]=u;
            Try(i+1,u+1,res);
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int[] res = new int[k];
        Try(0,1,res);
        System.out.printf("Tong cong co %d to hop", cnt);
        sc.close();
    }
}