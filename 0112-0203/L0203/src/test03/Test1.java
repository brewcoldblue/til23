package test03;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		//객체 안에 객체의 리스트가 들어가있을 때
		Person p = new Person("Lee", 30, false, null, new ArrayList<String>(), new ArrayList<Person>());
		p.hobbies.add("Youtube");
		p.hobbies.add("Netflix");
		p.friends.add(new Person("Park", 20, true, null, new ArrayList<String>(), new ArrayList<Person>()));
		p.friends.add(new Person("Oh", 20, false, null, new ArrayList<String>(), new ArrayList<Person>()));
		
		Gson gson = new Gson();
		
		String str = gson.toJson(p);
		System.out.println("JSON문자열이에요"+str);
		
		Person p2 = gson.fromJson(str, Person.class);
		System.out.println("객체입니다"+p2);
	}
}
