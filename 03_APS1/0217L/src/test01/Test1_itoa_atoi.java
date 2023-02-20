package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1_itoa_atoi {
	public static void main(String[] args) throws IOException {
		int zero = '0' - '0';
		int one = '1' - '0';
		int two = '2' - '0';
		//이 기법은 공백 없이 연속된 숫자가 입력으로 들어왔는데 이걸 따로 떼야할 때 유용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String str = br.readLine();
		
//		System.out.println(atoi(str));
		System.out.println(itoa(10579));
	}
	
	//int to string
	private static String itoa(int i) {
		StringBuilder sb = new StringBuilder();
		int tmp = i;
		while(tmp > 0) {
			//0이 되면 out
			char c = (char)(tmp % 10 + 48);
			//가장 마지막 숫자를 떼와 char로 바꾼 뒤, 48(0)을 더해야
			//해당 숫자의 문자코드가 됩니다.
			sb.append(c);
			tmp /= 10; //그 다음 자릿수의 숫자로 넘어간다.
		}
		//sb에 쌓이는데 역방향으로 쌓였을 것이다. 예)i = 4321 일 때 1234로 쌓였을 것
		return sb.reverse().toString(); //방향 바꿔주기
	}
	
	//string to int
	private static int atoi(String str) {
		char[] arr = str.toCharArray();
		int value = 0;
		
		int digit;
		for(int i=0; i<arr.length; i++) {
			//문자 타입의 숫자가 들어오면, '0' 을 빼서 숫자형으로 바꿉니다
			if(arr[i] >= '0' && arr[i] <= '9') digit = arr[i] - '0';
			else break;
			//자리수를 하나씩 올리면서 더합니다
			value = value*10 + digit;
		}
		return value;

	}
}
