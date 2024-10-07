//Hãy thực hiện thuật toán sắp xếp nổi bọt trên dãy N số nguyên. 
//Ghi ra các bước thực hiện thuật toán.
//
//Dữ liệu vào: Dòng 1 ghi số N (không quá 100). 
//Dòng 2 ghi N số nguyên dương (không quá 100).
//
//Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. 
//Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.

package Bai_2_Sap_xep_noi_bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        bubbleSort(arr);
        
        scanner.close();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int step = 0;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
            
            System.out.print("Buoc " + (++step) + ": ");
            printArray(arr);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
