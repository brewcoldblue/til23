package test;
import java.util.Scanner;
public class Ex3_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요."
				+ "\n\n"
				+ "1. 5판3승 \n2. 3판2승 \n3. 1판1승");
		
		int roundinput;
		int round = 0;
		int count = 0;
		int computerCount = 0;
		System.out.println("번호를 입력하세요: ");
		roundinput = sc.nextInt();
		if (roundinput == 1) round = 3;
		if (roundinput == 2) round = 2;
		if (roundinput == 3) round = 1;
		
		int random;
		String input;
		
		while (count != round && computerCount != round) {
			System.out.println("가위바위보 중 하나 입력: ");
			input = sc.next();
			random = (int) (Math.random()*3 + 1);
			switch(input) {
				case "가위": {
					if (random == 1) {
						System.out.println("비겼습니다!!!");
						count++;
						computerCount++;
					}
					if (random == 3) {
						System.out.println("이겼습니다!!!");
						count++;
					}
					if (random == 2) {
						System.out.println("졌습니다!!!");
						computerCount++;
					}
					break;
				}
				case "바위": {
					if (random == 2) {
						System.out.println("비겼습니다!!!");
						count++;
						computerCount++;
					}
					if (random == 1) {
						System.out.println("이겼습니다!!!");
						count++;
					}
					if (random == 3) {
						System.out.println("졌습니다!!!");
						computerCount++;
					}
					break;
				}
				case "보": {
					if (random == 3) {
						System.out.println("비겼습니다!!!");
						count++;
						computerCount++;
					}
					if (random == 2) {
						System.out.println("이겼습니다!!!");
						count++;
					}
					if (random == 1) {
						System.out.println("졌습니다!!!");
						computerCount++;
					}
					break;
				}
			}
		}
		if(count == computerCount && count == round && computerCount == round) System.out.println("### 비겼습니다!!!");
		else if(count == round) System.out.println("### 승리!");
		else if(computerCount == round) System.out.println("### 컴퓨터 승!!!");
	}

}
