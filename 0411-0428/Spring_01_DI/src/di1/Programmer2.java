package di1;

public class Programmer2 {
	private Desktop computer = new Desktop();
	
	public Programmer2(Desktop computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 코딩함");
	}
}
