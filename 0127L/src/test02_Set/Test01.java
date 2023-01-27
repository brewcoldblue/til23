package test02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>(); //원소 순서가 바뀐다?
		
		/*
		 * HashSet은 해시 테이블에 원소를 저장해 성능 면에서 우수함 (절대적이지는 X)
		 * 원소들의 순서가 일정하지 않음
		 * TreeSet은 red-black tree에 원소를 저장해 값에 따른 순서가 존재함(가나다순?)
		 * 값을 순서대로 정렬해야 한다면 고려해볼만한 선택지
		 * */
		
		set.add("홍승길");
		set.add("홍승길"); //오류는 안 나는데 중복 추가는 안됨
		set.add("정민우");
		set.add("이승재");
		System.out.println(set);
		
		System.out.println("홍승길".hashCode()); //해시코드는 그 자료를 고유의 정수값으로 나타낸 것
		System.out.println("홍".hashCode());
		System.out.println(new String("홍승길").hashCode()); //참조형으로 만들어도 같은 코드가 나온다
		//String 클래스에서 hashcode를 오버라이드했기 때문임
		System.out.println(new String("홍승길").equals("홍승길")); //equals도 값이 같음
		//hashset은 hashcode 비교, equals 비교 모두 true가 나와야 같다고 인정
		
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}
}
