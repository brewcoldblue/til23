package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3_caution {
	public static void main(String[] args) throws IOException {
		//주의해야 할 것
		//공백을 사이에 둔 숫자 2개를 입력받고, 그 다음 줄에서 문자열을 입력받을 때
		//1 3
		//abcdef
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str2 = sc.nextLine();
		//실제 입력은
		//1 3\n
		//abcdef\n
		//이므로,
		//token 단위로 끊어와 공백을 무시하는 nextInt()와 다르게
		//nextLine은 저 개행문자를 들고온다. 그러면 제대로 출력이 안될것
		//next, nextInt는 token 단위로 끊어서 입력을 받고, nextLine은 한 줄씩 입력을 받는다.
		//즉 nextLine은 \n 단위로 입력을 받기 때문에 입력이 씹힌 것처럼 보이는 것
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); //얘도 줄 단위로 가져옴
		
		//만약 줄단위와 토큰을 병행해서 가져와야 한다면, 줄 단위로 끊어오는 것을 기본으로 하고
		//StringTokenizer로 끊어와야 한다.
		//그리고 버퍼드리더랑 스캐너 혼용하지마셈
	}
}
