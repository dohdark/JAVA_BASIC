package collection;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		
		// <String> 제네릭
		// : 클래스 내부에서  사용할 자료형을 정의에 타임 세이프(안정성)을 구현하는 기능
		// : 미리 받을 데이터 타입을 정의!
		ArrayList<String> list = new ArrayList <> ();
		
		// CRUD
		// CREATE : 입력 add
		// READ   : 조회 get
		// UPDATE : 수정 set
		// DELETE : 삭제 remove
		
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");		// append
		list.add(1, "키위");		// insert
		list.set(0, "오렌지");
		list.remove(3);
		list.remove("키위");
		
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
		
	}	for (String item : list) {
		System.out.println(item);
	}
}
	
}


