package abstrct;

public class Chef {
	String name;
	int age;
	String speciality;
	
	public void eat() {
		System.out.println("음식을 먹는다");
	}

	public void cook() {
	    System.out.printf("%s을 요리한다.", speciality);
		System.out.println("전공에 맞는 요리를 한다.");
	}
}