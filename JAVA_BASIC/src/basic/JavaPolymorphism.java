package basic;

// 다형성
// : 상속받은 부모클래스 이름으로 객체 Type을 묶어 사용 가능
// : 조건
//	  -상속
//	  -부모객체 Type으로 통일


//	Super Class
//	 ↓		↓
// A Class  B Class	  D Class
//			↓		  ↓
//			C Class	  E Class

// 객체 생성					다향성 객체생성
// A a = new A();			Super a = new A();
// B b = new B();			Super b = new B();
// C c = new C();			Super c = new C();
// D d = new D();			D d = new D();
// E e = new E();			D e = new E();

//※ 다형성은 같은 타입이지만 실행결과가 다양한 객체를 이용할 수 있는 성질!
// 	코드 측면에서 봤을 때 다형성은 하나의 타임에 여러 객체를 대입함으로서 
//	다양한 기능을 이용할 수 있음!(부품화)
public class JavaPolymorphism {
	
	// Tire (상위)
	// ↓		↓
	// 한국		금호
	
	
	public static void genCar(CarBody cb, Tire tire) {
		//cb + hTire = 자동차 완성!
	}
	
	public static void main(String[] args) {
		CarBody cb = new CarBody();					// 자동차 바디
//		HankookTire hTire = new HankookTire();		// 한국 타이어 (4개)
//		KumhoTire kTire = new KumhoTire();			// 금호타이어
		
		Tire hTire = new HankookTire();		// 한국 타이어 (4개)
		Tire kTire = new KumhoTire();			// 금호타이어
		
		
		genCar(cb, kTire);
		
		
	}
	

}
