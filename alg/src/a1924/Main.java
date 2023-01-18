package a1924;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//1월 1일부터 며칠이 지났는지 산정
		//7로 나눈 나머지
		int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int daypassed = 0;
		
		for (int i = 0; i < x; i++) {
			daypassed += dates[i];
		}
		daypassed = daypassed + y;
		
		String[] days =  { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int daysindicator = daypassed % 7;
		System.out.println(days[daysindicator]);
	}
}
