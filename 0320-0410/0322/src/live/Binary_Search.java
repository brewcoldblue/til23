package live;

import java.util.Arrays;

public class Binary_Search {
	
	static int[] arr;
	static int key;
	
	public static void main(String[] args) {
		arr = new int[] { 1, 3, 4, 6, 7, 9, 81, 1162, 103245 };
		//정렬된 상태라고 가정
		key = 6;
		Arrays.binarySearch(arr, key); //이거 이미 구현되어 있음..ㅁㅊ
	}
	public static boolean bs(int st, int ed) {
		//못찾음
		if(st>ed) return false;
		
		//정수
		int mid = (st+ed)/2;
		
		//arr[mid] == key면 true
		if(arr[mid] == key) return true;
		//크면 검색 범위 좁히고 왼쪽에서 찾기
		else if(arr[mid]>key) bs(st, mid-1);
		//작으면 검색 범위 좁히고 오른쪽에서 찾기
		else bs(mid+1, ed);
		
		return false;
	}
}
