package test;
import java.util.Scanner;
public class Ex2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int i = 0;
//		
//		int[] arr = new int [3];
//		arr[0] = a;
//		arr[1] = b;
//		arr[2] = c;
		int a;
		int i=0;
		while (i<=3) {
			System.out.println("입력하세요");
			a = sc.nextInt();

			switch(a) {
				case 12: {
					System.out.println(a+"월은 겨울입니다.");
					break;
				}
				case 1: {
					System.out.println(a+"월은 겨울입니다.");
					break;
				}
				case 2: {
					System.out.println(a+"월은 겨울입니다.");
					break;
				}
				case 3: {
					System.out.println(a+"월은 봄입니다.");
					break;
				}
				case 4: {
					System.out.println(a+"월은 봄입니다.");
					break;
				}
				case 5: {
					System.out.println(a+"월은 봄입니다.");
					break;
				}
				case 6: {
					System.out.println(a+"월은 여름입니다.");
					break;
				}
				case 7: {
					System.out.println(a+"월은 여름입니다.");
					break;
				}
				case 8: {
					System.out.println(a+"월은 여름입니다.");
					break;
				}
				case 9: {
					System.out.println(a+"월은 가을입니다.");
					break;
				}
				case 10: {
					System.out.println(a+"월은 가을입니다.");
					break;
				}
				case 11: {
					System.out.println(a+"월은 가을입니다.");
					break;
				}
			}
			i++;
		}
	}
}
