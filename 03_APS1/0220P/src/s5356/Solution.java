package s5356;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int tc=1; tc<=TC; tc++) {
			int N = 5;
			
			 String[][] arr = new String [5][15];
			
			for(int n=0; n<5; n++) {
			 String str = sc.next();
			 String[] arr2= str.split("");
			 int len = arr2.length;
			 String blank = "?";
			 for(int i=0; i<15; i++) {
				if(i<len) arr[n][i] = arr2[i];
				else arr[n][i] = blank;
			 }
			}
			System.out.print("#"+tc+" ");
			for(int n=0; n<15; n++) {
				for(int m=0; m<5; m++) {
					if(arr[m][n].equals("?")) ;
					else System.out.print(arr[m][n]);
				}
			}
			System.out.println();
		}
	}
}

