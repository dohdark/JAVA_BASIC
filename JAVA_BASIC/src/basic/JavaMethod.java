package basic;

// 함수란 ? 자주 사용하는 기능
// -JAVA 제공 : 내장함수 built - in - function
// -직접 개발 : 사용자 정의 함수 
// -다른 사람 개발 : 외장함수 (라이브러리) : import 라이브러리명

// 함수문법 (method)
// 접근제한자		 [지정어]		 데이터반환타입 		메서드명 	(입력 파라미터){
// public		Static		기본자료형		
// protected	Abstract	객체자료형		
// default		Final		Void		
// private

//	실행코드
//	return 반환데이터 ;
// }

// 함수 사용하는 방법
// 1. 함수 정의
// 2. 함수 호출
// 
// 함수가 끝나는 지점
// 1. } 중괄호가 끝날때
// 2. return 을 만났을때

// return
// 1. 데이터 반환 타입 return 변수명 or 값 / 데이터 반환타입과 동일
// 2. return 만 단독으로 사용 가능
//  - 데이터 반환 X, 함수종료(=})
public class JavaMethod {
	
	//() x, return x 입력도 출력도 없는 기본함수
	public static void printJoin() {
		System.out.println("회원가입을 축하합니다.");
	}
	//() o, return o 입력과 출력이 있는 함수
	public static int printName(String name) {
		System.out.println(name + "회원님 가입을 축하합니다.");
		return 1;
	}
	
	public static void main(String[] args) {
		printJoin();
		printName("내조국밥");
	}

}

//
//객체(class)
//
//객체지향프로그램 언어
//- JAVA(Class 단위!) - 정석!
//  큰 시스템에 사용한다. (배달의민족) Spring Framework
//  
//- Python - 객체를 지향하고 싶은 프로그래밍?정도
		