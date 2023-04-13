package AOP;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void before() {
		System.out.println("컴퓨터 부팅하기");
	}
	public void afterReturning(int num) {
		System.out.println("GIT PUSH" + num + " 줄의 코드");
	}
	public void afterThrowing(Throwable th) {
		System.out.println("반차를 낸다");
		if(th instanceof OuchException) ((OuchException) th).handleException();
	}
	public void after() {
		System.out.println("보람찬 하루를 마무리한다");
	}
	
	///////////////////////////////////
	
	public int around(ProceedingJoinPoint pjp) { //핵심 관심사가 파라미터로 들어감
		int num = 0;
		
		this.before(); //요것들은 내부적으로 작성해도 되고 아니면 이것처럼 따로 빼서 작성해도됨
		try {
			num = (int) pjp.proceed(); //이게 바로 핵심 관심사항이 됨
			this.afterReturning(num);
		} catch (Throwable e) {
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		return num;
	}
}
