package s5432;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int tc=1; tc<=TC; tc++) {
			int N = 5;
			
			//문자열 길이는 30으로 주어져 있다

			String str = sc.next();
			String[] arr = str.split("");

			int pLength = 0;
			L1:
			for(int i=0; i<20; i++) {				
				for(int j=2; j<10; j++) {
					for(int k=1; i+j+k<30; k++) {
						if(arr[i].equals(arr[i+j]) && arr[i+k].equals(arr[i+j+k])) {
							pLength++;
							if(pLength == j) break L1;
						} else pLength = 0;
					}
					}

				}
			System.out.println("#"+tc+" "+pLength);
			}
		}
}



