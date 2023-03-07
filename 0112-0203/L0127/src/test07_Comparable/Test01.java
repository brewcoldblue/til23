package test07_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Park", "990126"));
		list.add(new Person("Lee", "880126"));
		list.add(new Person("Jung", "950126"));
//		Collections.sort(list); //err: Person은 comparable을 구현하고 있지 않음
		Collections.sort(list);
		System.out.println(list);
	}
}
