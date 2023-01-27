package a2309;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] hArr = new int[9];
		
		for (int i=0; i<9; i++) {
			int height = sc.nextInt();
			hArr[i] = height;
			sum += height;
		}
		
		int suspectors = sum - 100;
		L1 :
		for (int j=0; j<9; j++) {
			L2 :
			for (int k=0; k<9; k++) {
				if(j!=k && hArr[j] + hArr[k] == suspectors) {
					hArr[j] = -1;
					hArr[k] = -1;
					break L1;
				}
			}
		}
		Arrays.sort(hArr);
		
		for (int h : hArr) {
			if (h!=-1) System.out.println(h);
		}
	}
}