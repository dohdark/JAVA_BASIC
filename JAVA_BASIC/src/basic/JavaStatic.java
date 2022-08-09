package basic;

// [static] : 지정어

// 변수, 함수 : 자원공유 목적
// 클래스 : 이너클래스(중첩)

// static 이론 
//	- 객체생성하지 않고 사용가능!
//	- 인스턴스명으로도 호출 가능 그러나, 권장하지 않음!
//	- static 을 남발하면 OS의 메모리가 부족해져서 심각한 오류로 연결 됨.

public class JavaStatic {
	// 상수
	// 상수 => final 키워드
	static final double BANK_GOLD = 2.3;
	
	static String name;
	int age;

}
//JavaStatic js1 = new JavaStatic();
//JavaStatic js2 = new JavaStatic();
//
//js1.name = "체리";
//js2.name = "톰";