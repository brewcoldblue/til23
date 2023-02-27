package test01;

import java.util.Arrays;

public class Test2_reverse {
	public static void main(String[] args) {
		//문자열 뒤집기
		//1. swap
		
		String str = "삼성청년SW아카데미";
		char[] arr = str.toCharArray();
		//길이의 반 만큼만 반복
		for(int i=0; i<arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[n-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		//문자의 배열 => 문자열
		String str2 = String.valueOf(arr);
		System.out.println(str2);
		
		//2. 새로운 배열을 만들어서 거꾸로 뒤집기
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1; i>0; i--) {
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
		
		//3. StringBuilder
		sb.reverse();
	}
}
