package permutation;
import java.util.Arrays;

public class Next_Permutation {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		do {
			System.out.println(Arrays.toString(arr));
		} while(nextPermutation(arr));
	}
	
	private static boolean nextPermutation(int[] arr) {
		// 뒤쪽에서부터 탐색하며 내림차순 순열의 가장 앞인 인덱스 찾기
		// (i-1)가 교환할 위치의 인덱스
		int i = arr.length-1;
		while (i > 0 && arr[i-1] >= arr[i]) i--;
		
		// 전체 순열이 내림차순이므로 탐색 종료
		if (i == 0) return false;
		
		// 뒤쪽에서부터 탐색하며 위에서 고른 교환할 위치(i-1)의 값보다 큰 값이 있는 최초의 위치 찾기
		int j = arr.length-1;
		while (arr[j] <= arr[i-1]) j--;
		
		// i-1과 j번째 인덱스의 값 바꾸기
		swap(arr, i-1, j);
		
		// i번째 인덱스부터 끝까지의 값을 오름차순으로 변경
		reverse(arr, i, arr.length-1);
		
		return true;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void reverse(int[] arr, int i, int j) {
		while (i < j) swap(arr, i++, j--);
	}
}