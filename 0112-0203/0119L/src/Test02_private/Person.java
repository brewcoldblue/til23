package Test02_private;

public class Person { //class는 public or default
	private String name;
	private int age;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ㅎㅎ"; //자기 자신이므로 접근 가능
	}
}
