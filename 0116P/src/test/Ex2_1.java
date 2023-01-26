package test;
import java.util.Scanner;
public class Ex2_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int[] arr = new int [3];
//		arr[0] = a;
//		arr[1] = b;
//		arr[2] = c;
//		
//		for (int i=0; i<arr.length; i++) {				
//			if(3 <= arr[i] && arr[i] <= 5) System.out.println(arr[i]+"월은 봄입니다.");
//			else if(6 <= arr[i] && arr[i] <= 8) System.out.println(arr[i]+"월은 여름입니다.");
//			else if(9 <= arr[i] && arr[i] <= 11) System.out.println(arr[i]+"월은 가을입니다.");
//			else System.out.println(arr[i]+"월은 겨울입니다.");
//		}
		int a;
		for (int count = 1; count <= 3; count++) {
			a = sc.nextInt();
			if(3 <= a && a <= 5) System.out.println(a+"월은 봄입니다.");
			else if(6 <= a && a <= 8) System.out.println(a+"월은 여름입니다.");
			else if(9 <= a && a <= 11) System.out.println(a+"월은 가을입니다.");
			else System.out.println(a+"월은 겨울입니다.");
		}
	}
}
