package AOP;

public class OuchException extends Exception {
	public void handleException() {
		System.out.println("병원에나 가자");
	}
}
