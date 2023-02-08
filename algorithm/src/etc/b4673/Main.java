package etc.b4673;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[20000];
	
		for(int k=1; k<10000; k++) {
		int N = k;
		while (N <= 10000) {

			String Ns = Integer.toString(N);
			
			int dN = 0;
			for (int i=0; i<Ns.length(); i++) {
				dN = dN + ((int)Ns.charAt(i) - 48);
				
			}
			N = N + dN;
			arr[N]=N;
		}

	}
		for (int j=1; j<10001; j++) {
			if(arr[j] == 0) System.out.println(j);
		}
	}
}