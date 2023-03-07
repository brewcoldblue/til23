package test02;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 1, 2, 3, 3};
		
		//0. 최댓값 찾기, O(n)
		int k=-1;
		for(int i=0; i<arr.length; i++) {
			if(k<arr[i]) k = arr[i];
		}
		
		int[] count = new int[k+1]; //최댓값이 k니까 인덱스를 k+1까지 써야한다.
		
		//1. count 배열 만들기 , O(n)
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		//2. prefix 만들기, O(K)
		//prefix sum(누적합, 0부터 i까지) cf. suffix sum(i부터 n-1까지)
		int[] prefix = new int[k+1];
		prefix[0] = count[0];
		for(int i=1; i<count.length; i++) {
			prefix[i] = prefix[i-1] + count[i];
//			count[i] += count[i-1]; count 배열 더 쓸 일 없어서 그냥 prefix배열로 바꿔버려도 됨
		} //[0, 1, 3, 5, 6, 7]
		
		//3. arr을 다시 돌면서, arr2의 새로운 좌표에 옮긴다, O(n)
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[prefix[arr[i]] - 1] = arr[i]; //prefix - 1 = idx
			prefix[arr[i]]--; // 그 값 줄여줘야 함..
		}
		System.out.println(Arrays.toString(arr2));
		
		// => O(n+K)
	}
}
