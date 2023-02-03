package test02;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		Person p1 = new Person("Yang", 38, true, null, new ArrayList<String>());
		//배열 부분이 배열이 아니고 List일 때
		p1.hobbies.add("Youtube");
		p1.hobbies.add("Cooking");
		System.out.println(p1);
		
		Gson gson = new Gson();
		String str = gson.toJson(p1);
		System.out.println(str); //잘 됨
		
		Person p2 = gson.fromJson(str, Person.class);
		System.out.println(p2);
		p2.hobbies.add("으잉??");
		System.out.println(p2); // 오 이거 알아서 리스트로 바뀌는듯????
	}
}
