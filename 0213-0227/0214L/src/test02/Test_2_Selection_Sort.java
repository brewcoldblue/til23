package test02;

public class Test_2_Selection_Sort {
	public static void main(String[] args) {
		int[] A = {5, 4, 3, 2, 1};
		int n = A.length;
		
		for(int i=0; i<n-1; i++) {
			//매 패스에서 첫 번째 원소를 최소값이라 가정하고
			int idx = i;
			//그다음 원소부터 마지막 원소까지 비교합니다.
			for(int j=i+1; j<n; j++) {
				if(A[j] < A[idx]) idx = j;
			}
			//패스 첫 번째 원소와
			//진짜 최소값으로 판명된 원소의 위치를 바꿉니다.
			int temp = A[idx];
			A[idx] = A[i];
			A[i] = temp;
		}

	}
}
