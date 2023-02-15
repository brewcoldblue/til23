package test01;

public class Test2_Babygin {
	//Divide & Conquer로 접근하기 (분할 정복)
	public static void main(String[] args) {
		//3개짜리부터 해보고, 6개로 확장하기
		int[] arr = { 5, 4, 6 };
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				if(j!=i) {
					for(int k=0; k<arr.length; k++) {
						if(k!= i && k!= j ) {
							//이 부분에서 모든 경우의수가 만들어지므로 여기서 검증
							
							System.out.printf("%d, %d, %d => %s\n", arr[i], arr[j], arr[k], runCheck(arr[i], arr[j], arr[k]));
							System.out.printf("%d, %d, %d => %s\n", arr[i], arr[j], arr[k], tripletCheck(arr[i], arr[j], arr[k]));
						}
					}
				}
			}
		}
	}
	
	static boolean runCheck(int a, int b, int c) {
		return b == a+1 && c==a+2;
	}
	static boolean tripletCheck(int a, int b, int c) {
		return b == a && c==a;
	}
}
