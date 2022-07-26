package projects;



// 학점 계산기
// 내용 : 100분율 점수를 입력하면 A, B와 같이 학점을 부여하는 프로그램
public class projects {
	public static void main(String[] args) {
		// 0 ~ 100
		int score = 80; // 학생 백분율 점수
		
		//100 ~ 91 : A if			if
		// 90 ~ 81 : B else if		else if
		// 80 ~ 71 : C else if		else if
		// 70 ~ 61 : D else if		else if
		// 60 ~ 0  : F else if		else
		
		if(100 >= score && score >= 91) {
			System.out.println("A");
		} else if(90 >= score && score >= 81) {
			System.out.println("B");
		} else if(80 >= score && score >= 71) {
			System.out.println("C");
		} else if(70 >= score && score >= 61) {
			System.out.println("D");
		} else{
			System.out.println("F");
		}
		
		
		
	}

}
