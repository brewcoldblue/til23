package day0116;

public class Test03_Print {
	public static void main(String[] args) {
		System.out.print("Hello SSAFY!");
		System.out.print("HELLO GREAT 9th!");
		
		System.out.println("Hello SSAFY!"); //개행문자 더해짐
		System.out.println("HELLO GREAT 9th!"); //개행문자 더해짐
		System.out.println("\\\\"); //역슬래쉬는 이렇게 2개가 하나로 취급됨
		
		System.out.printf("%d\n", 10); //%d는 int!
		System.out.printf("%4d\n", 1000); //%d는 int!, 4칸을 확보한 다음 오른쪽부터 숫자를 채운다.
		System.out.printf("%-4d\n", 1000); //%d는 int!, 4칸을 확보한 다음 왼쪽부터 숫자를 채운다.
		System.out.printf("%04d\n", 10); //%d는 int!, 4칸을 확보한 다음 0을 채우고, 오른쪽부터 숫자를 채운다.
		System.out.printf("%f\n", 10.1); //%d는 int!, 정수면 에러남.
		System.out.printf("%f\n", 10.12345678); //%d는 int!, 정수면 에러남. 7번째 자리에서 반올림한다.
		System.out.printf("%.2f\n", 10.12345678); //소숫점 둘째 자리까지 나오게 함.
		System.out.printf("%c\n", 10); //%d는 int!
		System.out.printf("%s\n", 10); //%d는 int!
	}
}
