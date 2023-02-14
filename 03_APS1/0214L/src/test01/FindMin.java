package test01;

public class FindMin {
	public static void main(String[] args) {
		
		//최솟값과 그 인덱스를 찾는 알고리즘
		int[]arr = {32, 3, 33, 56, 2, 1, 4};
		int min = 0;
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				idx = i;
			}
		}
	}
}
