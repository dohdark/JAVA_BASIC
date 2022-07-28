package basic;
//
//사람 { //객체(class)
//	이름은 "공유" // 속성 (변수, variable or field)
//	취미는 "연기" // 속성 
//	
//	자기소개를 한다(공유) { //동작 (=행위) 함수(method)
//		공유가 인사를 한다;
//		공유가 이름을 말한다;
//		공유가 취미를 말한다;
//	}
//	
//	연기를 한다() { //동작
//		대본을 읽는다;
//		연기를 한다;
//	}
//}

public class Person { //사람 객체
	String name;	//이름 속성
	String hobby;	//취미 속성
	
	// 개발자가 만들지 않는다면 JAVA가 자동으로 생성한다 (생성자 함수)
	public Person() {
		introduce("이동욱");
	}
	
	public void introduce(String name){
		System.out.println(name + "가 인사를 한다.");
		System.out.println(name + "가 이름을 말한다.");
		System.out.println(name + "가 취미를 말한다.");
	}

}
