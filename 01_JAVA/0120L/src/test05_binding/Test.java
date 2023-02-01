package test05_binding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("유승윤", 333, "자바");
//		st. //이걸 찍었을 때 원래 어떤 클래스의 변수와 메소드인지 나옴
	
		//student는 person이기도 하고 Object이기도 하다 (다형성)
		Person st2 = new Student("김기완", 30, "정치외교학");
		st2.eat(); //지식을 먹는다
		//person을 붙였지만 메모리상에는 Student가 있게 된다.
	}
}
