package test08_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("유승윤", 333, "자바");
		Student st2 = new Student("유승윤", 343, "자바");
		Student st3 = st2;
		
		//집합에서는 중복된 원소가 제거된다
		Set<Student> set = new HashSet<>();
		set.add(st);
		set.add(st2);
		set.add(st3);
		System.out.println(set.size()); //2
}
}