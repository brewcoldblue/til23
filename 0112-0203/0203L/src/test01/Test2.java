package test01;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		//JSON -> Java 객체
		String str1 = "{\"name\":\"Lee\",\"age\":30,\"hungry\":false,\"hobbies\":[\"Youtube\",\"Cooking\"]}";
		//"" 안에 json 문자열을 집어넣어야하고, 그 안에 있는 모든 "들은 \로 escape해줘야함
		Gson gson = new Gson();
		Person p1 = gson.fromJson(str1, Person.class);
				//문자열을 객체로 만들 때에 자바에서는 클래스가 중요하므로
				//그 타입을 써줘야하는데, ClassName.class로 넣는다.
		System.out.println(p1);
		
		String str2 = "{\"name\":\"ㅋㅋ\",\"age\":24,\"hungry\":false,\"mbti\":null,\"hobbies\":[\"Youtube\"]}";
		//JS의 콘솔창에서 가져온거 갖다쓰면 어떻게될까?
		Person p2 = gson.fromJson(str2, Person.class);
		System.out.println(p2);
		//잘됨
	}
}
