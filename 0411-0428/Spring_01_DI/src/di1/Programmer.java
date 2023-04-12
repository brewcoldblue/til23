package di1;

public class Programmer {
	private Desktop computer;
	
	public Programmer() {
		computer = new Desktop();
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 코딩함");
	}
}
