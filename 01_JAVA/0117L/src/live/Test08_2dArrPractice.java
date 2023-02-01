package live;

import java.util.Arrays;

public class Test08_2dArrPractice {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int count = 1;
		for(int r=0; r<4; r++) {
			for(int c=0; c<4; c++) {
				arr[r][c] = count++; //count 넣고 count 증가시킴
			}
		}
		int[][] arr1 = new int[4][4];
		for(int r=0; r<4; r++) {
			for(int c=r; c<4; c++) { //삼각형 채우기의 기본 아이디어
				arr1[r][c] = count++; 
			}
		}
	}
}
