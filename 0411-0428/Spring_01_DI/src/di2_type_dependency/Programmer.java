package di2_type_dependency;

public class Programmer {
	private Computer computer;
	
	public Programmer() {

	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"���� �ڵ���");
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
