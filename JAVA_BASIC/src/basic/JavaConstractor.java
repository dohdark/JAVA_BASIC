package basic;

// 생성자(Constructor) 	:윈도우 시작 프로그램
//  - 객체를 생성함과 동시에 변수에 값을 초기화하거나 함수를 실행시킬 때 사용
//  1. 클래스명과 이름이 동일 (대소문자까지도)
//  2. 결과형 return값을 가지지 않음(void도 적지 않음)
//  3. 클래스 객체 생성시 반드시 하나의 생성자 호출!
//  4. 생성자를 실행시키지 않고 객체 생성 불가! (예외 : static)
//  5. 생성자 오버로딩 많이 사용(하나의 클래스에 다양한 생성자 존재 가능)
//	6. 생성자의 접근제한자는 클래스와 동일하게 만들어짐

public class JavaConstractor {
	public static void main(String[] args) {
		// 2.객체생성
		// - new Person();에서 new객체생성연산자와 Person()생성자 함수를 
		// 사용해서 객체를 생성, 생성 된 결과물 인스턴스
		// - 대입연산자(=)를 통해서 person 변수에 인스턴스를 담음
		Person person = new Person();
		
		// 3.객체사용
		// - person 변수에 담겨있는 인스턴스와 참조연산자(.)를 활용해서
		// 원하는 것을 사용
		person.introduce("공유");
	}
}

