package test01;

public class Test2_Delta {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
				};

		int N = 3; //length
		int r =  1; //초기 좌표 설정
		int c = 1;

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		int[][] drc = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];

			if (nr >= 0 && nr < N && nc >= 0 && nc < N) { //경계조건
				//범위 안이라면 작업하셈
				System.out.println(arr[nr][nc]); //작업 수행
				//5를 기준으로 2, 8, 4, 6 출력.
			}
			
			if (nr < 0 || nr >= N || nc < 0 || nc >= N) //경계조건2.
				continue; //바깥쪽 범위라면 그 루프 넘어감
			System.out.println(arr[nr][nc]);
		}
	}
}
