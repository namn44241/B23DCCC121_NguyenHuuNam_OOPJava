//Viết chương trình kiểm tra số nguyên dương N có thỏa mãn tính chất: 
//tất cả các chữ số cạnh nhau chỉ sai khác nhau đúng một đơn vị hay không. 
//Ví dụ: số 123212 là số thỏa mãn, số 34578 không thỏa mãn.
//
//Input
//
//Dòng đầu ghi số số test (không quá 20). 
//Mỗi test là 1 số nguyên dương N có ít nhất 2 chữ số, nhưng không quá 18 chữ số.
//
//Output
//
//Ghi ra YES hoặc NO

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
