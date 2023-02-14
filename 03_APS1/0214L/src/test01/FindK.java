package test01;

public class FindK {
	public static void main(String[] args) {
		//최솟값을 k번 찾으면 k번째 값이 될 것.
		//최솟값을 찾을 때마다 그 값을 제외시켜야 한다.
		//인덱스를 이용해서 하나씩 올리면 됨
		//최소값을 찾으면 그 값의 인덱스를 업데이트하고,
		//그 값과 i번 인덱스를 교환하여 k번 교환하면 된다.
		//k가 비교적 작을 때 유용하며 O(kn)의 시간을 필요로 한다.
		int[]arr = {1, 3, 5, 7, 2, 4};
		int k = 5;
		for (int i = 1; i<=k; k++) { //k번째 수를 찾기
			int idx = i; 
			for (int j = i+1; j<arr.length; j++) {
				if(arr[idx] > arr[j]) idx = j;
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}

	}
}
