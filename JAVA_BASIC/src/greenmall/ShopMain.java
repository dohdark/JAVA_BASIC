package greenmall;

import java.util.Scanner;

public class ShopMain {
	public static void main(String[] args) {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ Green Shop ");
		System.out.println("▒▒ Version : 1.2 ");
		System.out.println("▒▒ Written by KDH ");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("MSG : Green Shop입니다. 무엇을 도와드릴까요? ");
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 1. 제품 등록 ");
		System.out.println("▒▒ 2. 제품 삭제 ");
		System.out.println("▒▒ 3. 제품 조회 ");
		System.out.println("▒▒ 4. 제품 검색 ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ProductDAO pDao = new ProductDAO();
		
		if(num == 1) {
			pDao.productInsert();
		} else if(num == 2) {
			pDao.productDelete();
		} else if(num == 3) {
			pDao.productSelect();
		} else if(num == 4) {
			pDao.productSearch();
		}
	}
}
