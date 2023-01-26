package test;

public class Ex3_2 {
	public static void main (String[] args) {
		int c = 1; 
		int b = 0;
		boolean isIncrease = true;
		int target = 5/2; //공백 증가가 반전이 되는 포인트
		
//		while (c<=17) {
//			for(int i = 1; i <= 25; i++) {
//				
//				if(i <= 5 - 2 * b) {
//					 System.out.printf("%3d", c);
//					 c++;
//				}
//				else {
//					System.out.printf("%3s", "z");
//					b++;
//				}
//				
//			}
//		}
		while (c <= 17) {
			for (int i=0; i<b; i++)System.out.printf("%3s","");
			for(int i=0; i<5-2*b; i++) System.out.printf("%3d", c++);
			System.out.println();
			
			if (isIncrease) b++;
			else b--;
			
			if (b == target) isIncrease = false;
		}
		
			
		}
	}

