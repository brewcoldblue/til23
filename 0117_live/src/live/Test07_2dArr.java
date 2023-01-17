package live;

public class Test07_2dArr {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int[] arr2 [] = new int [3][4]; //비권장
		
		for (int r=0; r<3; r++) {
			for (int c=0; c<4; c++) {
//				System.out.printf("r:%d, c:%d\n", r, c);
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
		int[][] raggedArr = new int[3][]; //1차원 배열의 크기가 가변
		raggedArr[0] = new int[4];
		raggedArr[1] = new int[3];
		raggedArr[2] = new int[5];
	}
}
