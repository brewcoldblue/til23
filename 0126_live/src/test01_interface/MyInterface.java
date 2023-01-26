package test01_interface;

//interface 키워드 사용
public interface MyInterface {
	//모든 멤버변수는 public static final이며, 생략 가능
	public static final int MEMBER_1 = 15; //상수는 대문자로 쓴다
	int MEMBER_2 = 20; //p s f 생략됨
	
	//모든 메서드는 public abstract이며, 생략 가능
	public abstract void method1();
	void method2(); // p a 생략됨
	
}
