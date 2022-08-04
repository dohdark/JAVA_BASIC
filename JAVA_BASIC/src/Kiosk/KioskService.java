package Kiosk;

public class KioskService {
	
	
	// 사용자가 주문한 모든 메뉴의 모든 가격을 덧셈해서
	// main으로 전달하는 함수()
	public int calcTotalPrice(int [] priceOrder) {
		int total = 0;
		
		for (int price : priceOrder) {
			total += price; //total = total + price
		}
		
		return total;
	}

}
