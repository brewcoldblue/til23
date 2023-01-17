package live;

public class Test01_array {
	public static void main(String[] args) {
		int[] arr;
		int arr2[];
		
		arr = new int[3]; // 선언과 초기화 따로

		
		int[] arr3 = new int[5]; // int는 0으로 초기화
		int[] arr4 = new int[] {1, 2, 3, 4, 5}; // 이때는 길이 쓰지 않음
		int[] arr5 = {1, 3, 5}; // 이런 방식도 가능
		// arr2 = {1, 3, 5}; // 이거는 에러남. 반드시 한 줄에 써줘야함.
		
	}
}
