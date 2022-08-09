package Extend;

//메서드 오버라이딩 vs 메서드 오버로딩


// - 메서드명은 동일하지만
//	오버로딩 : 메서드 매개변수(DTO)
//	오버라이딩 : 메서드 실행부분(상속)  => 메서드 재정의

// 오버라이딩 (메서드 재정의)
// - 오버라이딩 -> 부모클래스의 메서드를 상속받아서 이름은 그대로 두고 실행부를 변경
// - 오버라이딩 되면 인스턴스로 메서드 호출시 재정의 된 메서드(자식)가 호출됨
public class ExtendMain {
//	public ExtendMain() {//default 생성자()
//	}
//	public ExtendMain(int age) {
//	}
//	public ExtendMain(String name) {
//	}
//	public ExtendMain(int age, String name) {
//	}
	public static void main(String[] args) {
		Child child = new Child();
		// 1. Child 객체 생성을 위해서 Child() 생성자 호출
		// 2. Child() 생성자의 맨 첫줄에서 super()를 통해 부모 생성자 호출을 통해
		//	부모 클래스 객체 생성
		// 3. Child() 생성자 실행
		// 4. Child 객체 생성 완료(인스턴스)
	
		child.printHello();		
		
		
		//JAVA에서 클래스를 사용하기 위해서는
		// 반드시 !! 객체 생성을 해야지만 사용가능 !!!!!!!!!!!!!!!!
		// 예외 : static
		
	}

}
