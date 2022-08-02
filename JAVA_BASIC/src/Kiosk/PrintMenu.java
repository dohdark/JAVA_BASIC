package Kiosk;

// 세트, 단품, 음료, 사이드 메뉴를 출력해주는 기능
// 


public class PrintMenu {
	
	public void printSet() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1. 기본 세트 (떡볶이 + 오뎅) (5500원) ");
		System.out.println("▒▒ 2. 커플 세트 (떡볶이 + 오뎅 + 순대) (8500원) ");
		System.out.println("▒▒ 3. 가족 세트 (떡볶이 + 오뎅 + 순대 + 튀김) (10000원) ");
	}
	public void printSingle() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1. 떡볶이 (3000원) ");
		System.out.println("▒▒ 2. 오뎅 (3000원) )");
		System.out.println("▒▒ 3. 순대 (3000원) ");
	}
	public void printDrink() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1. 환타 (1500원) ");
		System.out.println("▒▒ 2. 제로 콜라 (1500원) ");
		System.out.println("▒▒ 3. 마운틴 듀 (1000원) ");
	}
	public void printSide() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1. 만두 (1500원) ");
		System.out.println("▒▒ 2. 모듬 튀김 (2000원) ");
		System.out.println("▒▒ 3. 소세지 (1500원) ");
	}

}
