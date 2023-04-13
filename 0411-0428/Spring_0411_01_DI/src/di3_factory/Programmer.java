package di3_factory;

public class Programmer {
	private Computer computer;
	
	public Programmer() {

	}
	
	public Programmer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 코딩함");
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
