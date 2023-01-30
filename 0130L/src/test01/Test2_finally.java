package test01;

public class Test2_finally {
	public static void main(String[] args) {
		try {
			String str = "14141";
//			String str = "ssafy";
			System.out.println("code1 - before parse : "+str);
			int num = Integer.parseInt(str);
			System.out.println("code2 - after parse : "+str);
			return ; //리턴이 있을 경우에도 finally는 실행되지만,
			//리턴 되었기 때문에 code5는 실행되지 않는다.
		}
		catch (Exception e) {
			System.out.println("code3 - exception handling 완료!");
			
		}
		finally {
			System.out.println("code4 - 무조건 실행되는 finally");
		}
		System.out.println("code5 - 얘는 언제나 실행될까?");
	}
}
