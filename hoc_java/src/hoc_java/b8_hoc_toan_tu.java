package hoc_java;

public class b8_hoc_toan_tu {

	public static void main(String[] args) {
		double a = 2;
		System.out.println(a>= 5? "Đậu" : "Rớt");
		
		boolean b = (5 < 4) || (7 > 3) || (100 < 0);
		System.out.println(b);
		//true
		
		
		boolean c = (5 < 4) && (7 > 3) && (100 < 0);
		System.out.println(c);
		//false
		
		int x = 8;
		int y = 2;
		int z = x++ + ++y -5;
		System.out.println("x" + x);
		System.out.println("y" + y);
		System.out.println("z" + z);
		
	}

}
