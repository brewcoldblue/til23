package test01;

import com.google.gson.Gson;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class Test1 {
	//외부 라이브러리를 인식시키는 방법
	//1. JRE System Library에 끼워넣기 (좋은 방법아님)
	//2. 프로젝트 외부의 jar 파일 인식시키기 -> 프로젝트를 다른 곳으로 옮길때 깨질수 있음
	//3. 프로젝트 내부에 폴더를 만들고 jar 복사 후 인식시키기 (우리가 한것)
	// - 프로젝트 폴더 우클릭, build path, configure build path
	// - Library tab > Add JARS...
	//4. maven project로 바꾸고 pom.xml에 디펜던시 추가
	public static void main(String[] args) {
		Person p1 = new Person("Lee", 30, false, null, new String[] {"Youtube","Cooking" });
		//자가 객체 -> JSON 문자열로 바꾸기
		Gson gson = new Gson();
		String result = gson.toJson(p1);
		System.out.println(result);
		// {"name":"Lee","age":30,"hungry":false,"hobbies":["Youtube","Cooking"]}
		// null로 집어넣은 값은 삭제됨
	}
}
