package test01;

public class Test1_try_catch {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ssafy");
			int[] nums = {10};
			System.out.println(nums[1]);
			//catch문 안에 있는 예외 클래스는
			//그 클래스이거나, 그 자식 클래스의 자식 클래스인 경우만 매칭된다
		} catch (ArithmeticException e) {
			System.out.println("정수로 못 바꿔요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("바운더리 넘어갔어요");
		}
//		} catch (Exception e) {
//				System.out.println("다른 모든 예외");
//		}
		
		System.out.println("프로그램의 끝");
	}
}
