package test04;

public class Test_1_binarySearch {
	public static void main(String[] args) {
		
	}
	public static boolean binarySearch(int[]arr, int key) {
		int n = arr.length;
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) { //start가 end를 넘어가면 끝난다
			int middle = start+end/2;
			
			if(arr[middle]==key) return true;
			//중앙에서 찾으면 true
			else if(arr[middle] > key) end = middle - 1;
			//중앙에서 못 찾아서 key가 더 작으면 왼쪽 반에서 다시 검색
			//-> 끝점을 중앙-1로 옮김
			else start = middle + 1;
			//중앙에서 못 찾아서 key가 더 크면 오른쪽 반에서 다시 검색
			//-> 시작점을 중앙+1로 옮김
		}
		return false; //while문을 빠져나왔다?? == 못찾았다
	}
	//아래는 재귀함수로 구현한 것...
	public static boolean binarySearch2(int[] arr, int start, int end, int key) {
		if (start > end) return false; // 검색 실패
		int middle = (start + end) / 2;
		if (key == arr[middle]) return true; // 검색 성공
		else if (key < arr[middle]) // 왼쪽
		return binarySearch2(arr, start, middle-1, key);
		else if (key > arr[middle]) // 오른쪽
		return binarySearch2(arr, middle+1, end, key);
		return false;
	}
}