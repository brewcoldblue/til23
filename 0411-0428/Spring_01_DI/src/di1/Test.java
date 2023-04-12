package di1;

public class Test {
	public static void main(String[] args) {
		Desktop computer = new Desktop();
		Programmer2 p = new Programmer2(computer);
		p.coding();
	}
}
