package basic;

// Casting : 형변환(기본자료형 변환)
public class JavaCasting {
	public static void main(String[] args) {
		// "33" => 33
		// 3.14 => "3.14"
		
		// 1. 묵시적 : big <- small
		double pi = 3.14;
		pi = 3;
		System.out.println(pi);
		// 2. 명시적 : small <- big
		int num = (int)3.14;
		System.out.println(num);
	}

}