package test03;

public class Test_1_sequentialSearch {
	public static void main(String[] args) {
		//일치하는 값을 찾으면 종료, 일치하지 않으면 반복해야 하므로
		//for보다 while이 적합하다.
		int[] A = {6, 1, 3, 2, 5, 4};
		System.out.println(sequentialSearch(A, 5));
	}
	
	public static int sequentialSearch(int[]arr, int key) {
		int n = arr.length;
		int i = 0;
		
		while(i<n && arr[i] != key) {
			//인덱스를 넘어가면 에러가 발생하니까, i값을 n-1까지로 제한한다.
			i++;
		}
		
		//조건식이 false가 되면 빠져나온다.
		//즉 인덱스 내에서 key를 찾았거나,
		//끝까지 갔는데 못 찾아서 i가 n이 된 경우에 빠져나온다.
		
		if(i>=n) return -1; //못 찾은 상황, i>=n일 때
		else return i; //key를 찾은 상황
	}
}
