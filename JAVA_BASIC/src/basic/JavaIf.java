package basic;

// 제어문
// 1.조건문
//	- if~else if~else
//	- switch~case~default
// 2.반복문
//	- for = 반복 횟수가 정해져 있을때
//	- while = 반복횟수를 모를때 [탈출구를 마련해야한다] = [break]
public class JavaIf {
	public static void main(String[] args) {
		// if로 시작해야 한다
		// 조건을 여러개를 주고싶으면 else if 를 추가한다.
		// else : 위의 조건을 모두 만족하지 못했을때 실행한다.
		// 
		if(조건문) {
			실행1
		}else if(조건문) {
			실행2
		}else {
			실행3
		}
	}
}