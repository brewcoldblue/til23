package s1989;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String N = sc.next();
			char[] arr = N.toCharArray(); //입력받은 문자를 배열로 바꿈
			boolean flag = true; //일단 팰린드롬이라고 가정
			for(int i=0; i<arr.length/2; i++) {
				if(arr[i] != arr[arr.length-1-i]) {
					flag = false; //아니네?
					break; //그만하고 나와
			}
			if(flag) System.out.println("#"+tc+" "+1); //끝까지 다 일치하면 1
			else  System.out.println("#"+tc+" "+0); //아니면 0
		}
	}
}
}