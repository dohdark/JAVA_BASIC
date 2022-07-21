package basic;

// 변수 : 하나의 값을 저장할 수 있는 메모리 공간

// 자료형(데이터 타입)
//	1.기본자료형 (8가지)
//	 -short, byte, int, long (정수형) long은 선언할때 num=3L; 뒤에 L을 붙여 선언한다.
//	 -float, double (실수형)
//	 -char (문자형) 'A', '!'
//	 -boolean (논리형) = true or false
//
//	2.객체자료형 (기본자료형 제외한 모든 자료형은 객체자료형이다)
//	 -Class
//	 -Array
//	 -String (문자열) "hello"
public class JavaVariable {

public static void main(String[] args) {
	//문법 : 변수 선언 및 초기화
	//int num; : 변수 선언
	//num=4; : 변수초기화
	// = : 대입연산자 (우측값을 좌측으로)
	// == : 동등연산자 (같다)
	int num=4;
	
	int num2;
	num2=10;
	// 상수 : 한번 선언하면 바뀌지 않는 값
	// 상수는 "final" 키워드를 사용
	// 상수는 선언 + 초기화 문법으로만 사용 가능
	final double pi = 3.14
			pi = 3.33 // 문법(x) 에러 발생
}
}
