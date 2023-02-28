package test01;

import java.util.Stack;

public class Test2_stack_generic_class {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//사실 자바 클래스에는 스택이 구현되어있다...
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		while(!stack.isEmpty()) System.out.println(stack.pop());
	}
}
