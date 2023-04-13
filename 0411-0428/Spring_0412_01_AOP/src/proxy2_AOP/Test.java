package proxy2_AOP;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		SSAFY s = new SSAFY();
		
		PersonProxy px = new PersonProxy(); //런타임에서 proxy를 만드는 것: Weaving
		System.out.println("Programmer----------------------------");
		px.setPerson(p);
		px.coding();
		System.out.println("SSAFY---------------------------------");
		px.setPerson(s);
		px.coding();
	}
}
