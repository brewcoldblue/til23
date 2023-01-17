package live;

import java.util.Arrays;

public class Test06_numberOf {
	public static void main(String[] args) {
		
		int[] intArr2 = { 3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3 };
		//카운팅 배열을 만들어서 개수 세기
		int[] count = new int[10];
		for (int num : intArr2) {
			count[num]++;
		}
		System.out.println(Arrays.toString(count));
		//[0, 2, 2, 2, 0, 2, 0, 3, 1, 1]
	}
}
