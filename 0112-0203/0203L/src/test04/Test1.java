package test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		// 자바스크립트 객체의 배열 -> 자바에서 객체의 배열 ㅇㅋ 리스트 ㅇㅋ
		// 
		Person[] arr = new Person[3];
		arr[0] = new Person("Lee", 30);
		arr[1] = new Person("Yang", 30);
		arr[2] = new Person("Park", 30);
		
		Gson gson = new Gson();
		String str = gson.toJson(arr);
		System.out.println(str); //배열 안에 객체 넣어도 잘 나옴
		
		List<Person> list = new ArrayList<>(); //리스트는 인터페이스!
		list.add(new Person("Oh", 20));
		list.add(new Person("Hong", 20));
		list.add(new Person("Jung", 20));
		
		String str2 = gson.toJson(list);
		System.out.println(str2); //결과가 똑같음. 배열 대신 리스트(arrayList) 써도됨
		
		Person[] arr2 = gson.fromJson(str2, Person[].class);
		System.out.println(Arrays.toString(arr2)); // 역방향 잘 됨
		
//		List<Person> list2 = gson.fromJson(str2, ArrayList.class);  이렇게 하지 말고

		List<Person> list2 = Arrays.asList(arr2); //이렇게 해야 정상적으로 바뀐다
		System.out.println(list2);
		
	}
}
