package Test03_default;

public class Person { //class는 public or default
	String name; //접근제한자를 생략함, default
	int age;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ㅎㅎ"; //자기 자신이므로 접근 가능
	}
}
