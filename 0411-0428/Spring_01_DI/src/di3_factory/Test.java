package di3_factory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Programmer p = new Programmer();
		Computer computer = ComputerFactory.getComputer(sc.next());
		p.setComputer(computer);
		p.coding();
	}
}
