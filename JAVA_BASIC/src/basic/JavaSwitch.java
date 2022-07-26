package basic;

public class JavaSwitch {
	public static void main(String[] args) {
		
		// Switch ~ case
		// key를 입력받고 해당 key와 동일한 case 를 실행
		
		// key : 동물
		switch ("하마") {
		case "사자":
			System.out.println("어흥");
			break;
			
		case "양":
			System.out.println("메~~");
			break;
			
		case "원숭이":
			System.out.println("우끼끼");
			break;
			
		default:
			System.out.println("그런 동물은 없습니다.");
			break;
		}
	}

}
