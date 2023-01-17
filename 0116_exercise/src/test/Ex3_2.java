package test;

public class Ex3_2 {
	public static void main (String[] args) {
		int n = 0;
		for(int i = 5; i >= 1; i=i-2) {
			System.out.printf("%"+(21 - 4*i)+"s", "");
			System.out.println(i);
		}
	}
}
