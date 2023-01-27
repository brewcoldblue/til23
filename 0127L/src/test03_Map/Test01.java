package test03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
		//Map
		//사전과 같은 자료구조
		//키-값 쌍으로 저장, 키로 구별
		//키는 중복 불가, 값은 중복 가능
		Map<String, String> map = new HashMap<>(); //<Key, Value>
//		Map<String, String> map = new TreeMap<>(); //<Key, Value>
		map.put("Hong", "010-2222-2222"); //추가
		map.put("Yang", "010-3333-3333");
		map.put("Lee", "010-9999-9999");		
		
		map.put("Lee", "010-8888-8888"); //중복된 key 넣으면 새 값으로 덮어쓰기

		System.out.println(map);
		
		System.out.println(map.get("Yang")); //key로 값 가져오기
		System.out.println(map.get("Kim")); //없는 키 쓰면 null
		
		System.out.println(map.containsKey("kim")); //key가 있는지 확인
		System.out.println(map.containsValue("010-3333-3333")); //값이 있는지 확인
		
		// 전체 조회
		System.out.println("==========전체 조회==========");
		for(Map.Entry<String, String> entry : map.entrySet()) { //각각의 k, v 쌍을 하나씩 꺼내줌
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("==========Iterator==========");
		Iterator<String> e = map.keySet().iterator(); //key만 알면 조회 가능
//		while(e.hasNext()) {
//			String key = e.next();
//			System.out.printf("키: %s, 값: %s \n", key, map.get(key));
//		}
		for (String key : map.keySet()) {
			System.out.printf("키: %s, 값: %s \n", key, map.get(key));
		} //이렇게도 가능함
}
}
