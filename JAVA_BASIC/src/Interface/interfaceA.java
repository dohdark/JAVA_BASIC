package Interface;


// - 인터페이스는 클래스가 아님 (객체 X)
// - 인터페이스는 객체의 사용방법을 정의한 타입 또는 매개체(객체와 객체의 소통수단)
// - JAVA 7버전까지는 인터페이스내에 상수, 추상메서드 가능
// - JAVA 8버전부터 정적메서드와 디폴트메서드도 올 수 있음! (잘 사용 안함)
// - 인터페이스 내에 함수는 기본적으로 pubilc 권한을 가짐
// - 인터페이스 명명룰은 Interface + 이름
// - 이름 + Impl(구현했다) : 인터페이스를 구현 받아 작성하는 하위 클래스
// - 다형성 가능!(상속, 구현)


// 하위 키워드는 생략가능 (컴파일 과정에서 JAVA가 자동적으로 붙여줌)(public, static,final,abstract)
// - public static final 변수명(상수)
// - public abstract 함수명(추상메서드)

//  상속과 구현의 차이점!
// - extends				implements
// - 단일상속					다중구현
// - 클래스-클래스(상속)		인터페이스-클래스
// - 						인터페이스-인터페이스(상속)
public interface interfaceA {
	public void methodA();
	
}
