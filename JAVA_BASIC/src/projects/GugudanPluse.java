package projects;

public class GugudanPluse {
	public static void main(String[] args) {
		int dansu = 2;
		// 2x1=2
		// 2x2=4
		// ...
		// 2x9=18
		for(int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				int result = j * i;
				System.out.println(j + "x" + i + "=" + result);
				
			}
		}
	}
}