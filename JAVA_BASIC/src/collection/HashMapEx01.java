package collection;

import java.util.HashMap;
import java.util.Map;

// HasyMap
// - Key : Value가 한 쌍으로 구성
// - Key값은 중복 X
// - Value값은 중복 O

public class HashMapEx01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// CRUD
		// C : put		
		// R : get		
		// U : put		
		// D : remove	
		
		// put (k, v);
		// put 실행 map 안에 k 가 없으면 입력
		// put 실행 map 안에 k 가 있으면 수정
		
		
		map.put("한국", "서울");
		map.put("프랑스", "파리");
		map.put("미국", "워싱턴");
		map.remove("미국");
		map.put("프랑스", "런던");
		
		System.out.println(map.get("프랑스"));
		System.out.println("Map크기 : " + map.size());
		
	}

}
