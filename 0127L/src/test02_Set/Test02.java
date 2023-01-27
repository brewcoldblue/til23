package test02_Set;

import java.util.HashSet;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Set<Person> ps = new HashSet<>();
		Person p1 = new Person("양명균", "880126");
		Person p2 = new Person("양명균", "880126");
		
		ps.add(p1);
		ps.add(p2);
		
//		//hashCode, equals 두개가 같아야 같은 걸로 보는데
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		//두 개의 해시코드가 다르고
//		System.out.println(p1.equals(p2));
//		//equals의 결과도 다르다고 나옴
//		//그래서 이 두개의 메서드를 오버라이드 해야함
		
		
		
		System.out.println(ps);
	}
}
