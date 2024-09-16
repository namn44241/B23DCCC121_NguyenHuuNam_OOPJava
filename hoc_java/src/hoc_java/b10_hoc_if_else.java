package hoc_java;

import java.util.Scanner;

public class b10_hoc_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mơif nhap");
		int t = sc.nextInt();
		if (t % 2 == 0 || t ==7 )
		{
			System.out.println("tháng: " + t + "có 31 ngày");
		}
		else
		{
			System.out.println("sai");
		}
	}

}
