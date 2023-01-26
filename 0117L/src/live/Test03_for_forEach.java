package live;
import java.util.Arrays;
import java.util.Scanner;
public class Test03_for_forEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for (int i = 0; i<5; i++) {
			scores[i] = sc.nextInt();
		}
//		for(int i = 0; i<5; i++) {
//			System.out.println(i +"번째 점수는"+ scores[i]);
//		}
		for(int score : scores) {
			System.out.println("점수는 "+score);
		}
		
		System.out.println(Arrays.toString(scores)); //배열 출력하기
		
		int sum = 0;
		for (int num:scores) {
			sum = sum + num;
		}
		System.out.println(sum / 5); //평균 만들기
	}
}
