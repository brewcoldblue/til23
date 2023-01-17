package live;

public class Test05_minmax {
public static void main(String[] args) {
	int[] intArr = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };
	int min = intArr[0];
	int max = intArr[0];
	for (int num : intArr) {
		if(num < min) {
			min = num;
		}
		if(num > max) {
			max = num;
		}
	}
	System.out.printf("min: %d, max: %d", min, max);
	//min: 3, max: 435

}
}
