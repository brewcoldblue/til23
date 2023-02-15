package test01;

public class Test1_순열 {
	public static void main(String[] args) {
		//a부터 b까지의 연속된 숫자 중에서 3개를 뽑아 나열
		int a = 1;
		int b = 4;
		
		for(int i=a; i<=b; i++) {
			for(int j=a; j<=b; j++) {
				//이때 j는 i면 안된다 (전에 고른 수랑 달라야함)
				if(j!=i) { //if문 안에서 그 다음 for문이 돌아야함
					for(int k=a; k<=b; k++) {
						//k는 i도 아니고, j도 아니어야 한다.
						if(k!=i && k!=j) {
							System.out.printf("%d %d %d\n", i, j, k);
						}
					}
				}
			}
		}
		System.out.println();
		//연속되지 않은 경우는 어떻게? -> 배열 사용하는 아이디어, 배열에 넣고 인덱스로 돌리기
		int[] arr = {2, 5, 8, 9};
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				if(j!=i) {
					for(int k=0; k<arr.length; k++) {
						if(k!= i && k!= j ) {
							System.out.printf("%d, %d, %d\n", arr[i], arr[j], arr[k]);
						}
					}
				}
			}
		}
	}
}