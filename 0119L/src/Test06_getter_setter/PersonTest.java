package Test06_getter_setter;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(28); // 멤버 변수의 값을 수정할 수 있다
		p1.setName("유승윤");
		p1.setHungry(true);
		
		p1.setAge(-1);
		p1.setAge(155783308);
		
		
//		System.out.println(p1.age); //이렇게는 접근이 안된다(not visible)
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.isHungry());
	}
}
