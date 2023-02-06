package sandbox;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case<=T; test_case++) {
			String M = sc.next();
			String[] mArr = M.split("");

			int flag = -1;
			int answer = 0;
			if(mArr[0].equals("0")) flag = 0;
			for(int j=0; j<mArr.length; j++) {

				if(flag != Integer.parseInt(mArr[j])) {
					flag = Integer.parseInt(mArr[j]);
					answer++;
				}
				
			}
			System.out.println("#"+test_case+" "+answer);
			answer = 0;
		}
	}
}
