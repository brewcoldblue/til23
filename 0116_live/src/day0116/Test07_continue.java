package day0116;

public class Test07_continue {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			if(i==3) continue;
//			System.out.println(i); //3일 때 실행 안하고 다음으로 바로 넘어감
//		}
		label: for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i==1) break label; //바깥쪽 반복문에서 나와버림
				System.out.println(i + "," + j);
			}
		}
	}
}
