package hoc_java;

import java.util.Scanner;

public class b9_hoc_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhập số:");
		int a = sc.nextInt();
		System.out.println("mày vừa nhập int:" + a);
		
		System.out.println("nhập double:");
		double b = sc.nextDouble();
		System.out.println("vừa nhập double:" + b);
		
		String c = new Scanner(System.in).nextLine();
		System.out.println("vừa nhập chuỗi:" + c);
	}

}
