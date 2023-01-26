package test11_polymorphism3;

public class test {
	public static void main(String[] args) {
		SubClass child = new SubClass();
		System.out.println(child.x);
		child.method();
		
		SuperClass parent = child;
		System.out.println(parent.x);
		parent.method();
		//오버라이드된 메서드 나옴
		//실제 만들어진 객체는 자식이어서.
		//근데 변수는 super로 나옴. 멤버변수는 원래 것이 나옴
	}
}
