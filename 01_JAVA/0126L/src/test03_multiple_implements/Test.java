package test03_multiple_implements;

public class Test {
	public static void main(String[] args) {
		Duck d = new Duck();
		Eagle e = new Eagle();
		
		//polymorphism
		AbleToFly f = d; //이게 되네 근데 이렇게 하면 사냥이랑 수영 못함
		
		
	}
}
