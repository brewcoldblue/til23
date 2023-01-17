package live;

import java.util.Arrays;

public class Test04_copy {
public static void main(String[] args) {
	int[] scores = new int[] {29, 45, 99, 10, 55};
	// scores[5] = 44; 이거 자바에서 불가능
	
	int[] newScores = new int[10]; //전통적인 반복문으로 복사
	for(int i=0; i<5; i++) {
		newScores[i] = scores[i];
	}
	System.out.println(Arrays.toString(newScores));
	//[29, 45, 99, 10, 55, 0, 0, 0, 0, 0]

	int[] newScores2 = Arrays.copyOf(scores, 8);
	System.out.println(Arrays.toString(newScores2));
	//[29, 45, 99, 10, 55, 0, 0, 0]
}
}
