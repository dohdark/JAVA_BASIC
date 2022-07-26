package projects;

public class Gugudan {
	public static void main(String[] args) {
		int dansu = 2;
		// 2x1=2
		// 2x2=4
		// ...
		// 2x9=18
		
		for (int i = 1; i <= 9; i++) {
			int result = dansu * i;
			System.out.println(dansu + "x" + i + "=" + result);
			
		}
	}

}
