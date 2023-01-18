package a11721;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.nextLine();
		
		int length = T.length();
		
		String result = "";
		
		for(int i = 0; i<length; i++) {
			if(i == length - 1) {
				result += T.charAt(i);
				System.out.println((String)result);
				break;
			}
			if(i%10 != 9) result += T.charAt(i);
			else {
				
				result += T.charAt(i);
				System.out.println((String)result);
				result = "";
			}

		}
	}
}