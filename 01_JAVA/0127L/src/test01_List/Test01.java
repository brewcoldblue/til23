package test01_List;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		//List
		List<String> names = new ArrayList<>();
//		List<String> names = new LinkedList<>();
//		List<String> names = new Vector<>();
		
		names.add("안중근");
		names.add("이봉창");
		names.add("이순신");
		names.add(0, "이순신"); //0번 인덱스에 집어넣기
		
		System.out.println(names);
		names.set(2, "킹세종"); //수정하기
		System.out.println(names);
		
		System.out.println(names.isEmpty()); //비었는지 확인
		System.out.println(names.size()); //원소의 개수
		
		for(String name: names) {
			System.out.println(name);
		} //조회는 반복문으로
		
		Iterator<String> e = names.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		} //반복자를 사용할 수도 있음
		
		names.remove(2); //2번 인덱스 삭제
		names.remove("이순신"); //값 삭제, 맨 앞의 하나만 삭제됨
		System.out.println(names);
		names.clear(); //전부 삭제

		names.add("홍승길");
		names.add("홍승길");
		names.add("정민우");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		//홍승길을 삭제하고 싶을 때
		for (int i=0; i<names.size(); i++) {
			if(names.get(i).equals("홍승길")) names.remove(i);
		}
		//이렇게 하면 앞의 홍승길 하나만 삭제됨. names의 사이즈가 동적으로 변해서
		// 뒤까지 가지 못하고 반복문이 끝남
		System.out.println(names); 
		
		for (int i=names.size() - 1; i>=0; i++) {
			if(names.get(i).equals("홍승길")) names.remove(i);
		}
		//이렇게 뒤에서부터 처리해야함
		System.out.println(names);
		
	}
}
