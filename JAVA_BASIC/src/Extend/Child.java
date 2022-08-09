package Extend;


public class Child extends Parent{
	public Child() {
		super();  // 상속받은 경우 JAVA가 자동 생성
	}

	
	// @ : 어노테이션
	// 표지판기능
	@Override
	public void printHello() {
		super.printHello(); // 부모의 printHello() 함수 호출
		System.out.println("나는 자식이다!!");
	}
}
