package test;

public class Ex3_1 {
	public static void main (String[] args) {
		int n = 0;
		for(int i = 5; i >= 1; i--) {
			System.out.printf("%"+(21 - 4 * i)+"s", "");
				for (int j = 1; j <= i; j++) {
					System.out.printf("%2s", "");
					System.out.printf("%2d", j + n);
					if(j == i) System.out.print("\n");
				}
			n = n + i;
		}
		
		int count = 1; // 선언과 동시에 할당할것.
		for(int i = 0; i < 5; i++) {
			// 행을 순회하는 첫 반복문
			for(int j = 0; j < 5; j++) {
				// 열을 순회하는 두 번째 반복문
				if(j < i) {
					System.out.printf("%3s","");
				} else {
					System.out.printf("%3d", count);
					count++;
				}
			}
			System.out.println();
		}
		
	}
}