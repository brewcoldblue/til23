package test03;

public class Test_2_sequentialSearch_ordered {
	public static void main(String[] args) {
		//주어진 배열이 정렬된 상태일 때
		//최소와 최댓값을 알아서 범위를 안다고 할 때.
		int[] A = {1, 2, 3, 4, 5, 6};
		System.out.println(sequentialSearch(A, 5));
	}
	
	public static int sequentialSearch(int[]arr, int key) {
		int n = arr.length;
		int i = 0;
		
		while(arr[i] < key) {
			//key보다 큰 값이 나왔을 때 종료한다.
			i++;
		}
		
		//조건식이 false가 되면,
		//즉 arr[i] >= key면 빠져나온다.
		
		if(arr[i] == key) return i; //key와 같은 상황
		else return -1; //key보다 큰 값이 나온 상황, 검색할 필요 없이 key는 거기 없다
	}
}
