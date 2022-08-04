package Kiosk;

import java.util.Scanner;

public class KioskMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintMenu printMenu = new PrintMenu();
		KioskService kioskService = new KioskService();
		
		// 배열을 활용해서 메뉴표와 가격표 생성
		
		String [] nameSet = {"기본세트", "커플세트", "가족세트"};
		String [] nameSingle = {"떡볶이", "오뎅", "순대"};
		String [] nameDrink = {"환타", "제로 콜라", "마운틴 듀"};
		String [] nameSide = {"만두", "모듬튀김", "소세지"};
		
		int [] priceSet = {5500, 8500, 10000};
		int [] priceSingle = {3000, 3000, 3000};
		int [] priceDrink = {1500, 1500, 1000};
		int [] priceSide = {1500, 2000, 1500};
		
		
		
		String [] nameOrder= new String[10]; // 주문 기록 : 이름
		
		int [] priceOrder = new int[10];	// 주문 기록 : 가격
				
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 상무 떡볶이 1호점 ");
		System.out.println("▒▒ Version : 1.0 ");
		System.out.println("▒▒ Written by KDH ");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("MSG : 상무 떡복이 1호점을 방문해주셔서 감사합니다. ");
		
		int count = 0;
		while(true) {
			// 1. 메인 메뉴 선택
			
			System.out.println("MSG : 주문하고 싶은 메뉴를 선택하세요. ");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 1. 세트메뉴 ");
			System.out.println("▒▒ 2. 단품 ");
			System.out.println("▒▒ 3. 음료 ");
			System.out.println("▒▒ 4. 사이드 ");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			int num;
			
			while(true) {
				System.out.print("번호 >>");
				num = sc.nextInt();
				
				if(num < 1 || num > 4) {
					System.out.println("MSG : 1 ~ 4 의 값만 입력해주세요.");
				} else {
					break;
				}
				
			}
			
			// 2. 서브메뉴 선택
			
			if(num == 1) {					//세트메뉴
				printMenu.printSet();
				
			}else if(num == 2){				//단품
				printMenu.printSingle();
				
			}else if(num == 3){				//음료
				printMenu.printDrink();
				
			}else if(num == 4){				//사이드
				printMenu.printSide();
				
			}
			
			int selectNum;
			
			
			while(true) {
				System.out.print("번호 >>");
				selectNum = sc.nextInt();
				
				if(selectNum < 1 || selectNum > 3) {
					System.out.println("MSG : 1 ~ 3 의 값만 입력해주세요.");
				} else {
					break;
				}
				}
			
				
			
			
			// 저장 된 메뉴와 가격표 출력
		
			// Main - Sub 메뉴까지 선택완료
			//  -배열에 선택한 메뉴이름 / 가격저장
			//  -num => main 선택
			//  -selectNum => sub 선택
			
			// 3.사용자가 선택한 메뉴 / 가격 저장
			if (num == 1) {				//Set메뉴
				
					nameOrder[count] = nameSet[selectNum-1];
					priceOrder[count] =	priceSet[selectNum-1];
				
				
			} else if(num == 2) {		//단품메뉴
				
				nameOrder[count] = nameSingle[selectNum-1];
				priceOrder[count] =	priceSingle[selectNum-1];
				
			} else if(num == 3) {		//드링크메뉴
				
				nameOrder[count] = nameDrink[selectNum-1];
				priceOrder[count] =	priceDrink[selectNum-1];
				
			} else if(num == 4) {		//사이드메뉴
				
				nameOrder[count] = nameSide[selectNum-1];
				priceOrder[count] =	priceSide[selectNum-1];
				
			}
			
			count += 1; // count = count + 1
			
			if(count == 10) {
				break;
			}
			
			// 4. 다시 반복 or 결제창으로 넘어갈것인가?
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("MSG : 결제 (1) / 추가 메뉴 (0) ");
			System.out.println("번호 >>");
			int useyn = sc.nextInt();
			
			if(useyn == 1) {
				break;
			}else if(useyn == 0) {
				continue;
			}
		}
		
		
		// 5. Total Print
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 고객님이 주문하신 메뉴는 " + count + "개로");
		System.out.print("▒▒");
		for(String item : nameOrder) {
			if (item == null) {
				break;
			}
			System.out.print(item + " ");
		}
		System.out.println("");
		System.out.println("▒▒ 입니다.");
		
		
		
		//6. Total Price
		
		int total = kioskService.calcTotalPrice(priceOrder);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 총 주문 금액은" + total + "원 입니다.");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		
		
		
		
		
		
		
//		for(int i = 0; i< nameOrder.length; i++) {
//			System.out.println(nameOrder[i]);
//		}
//		for(int price : priceOrder) {
//			System.out.println(price);
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}}
