package basic;

public class JavaStaticUse {
	public static printName(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		//JavaStatic js = new JavaStatic();
		JavaStatic.name = "체리";
		System.out.println(JavaStatic.BANK_GOLD);
		
		printName("그린컴퓨타");
	}


}


// 객체 생성 => heap 영역 인스턴스 만들어짐.
// static => OS영역 값이 생성