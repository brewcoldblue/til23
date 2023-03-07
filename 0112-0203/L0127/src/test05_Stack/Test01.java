package test05_Stack;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); //스택은 클래스임!!!
		
		for(int i=0; i<10; i++) {
			stack.push(i); //add도 있는데 굳이 쓰지 말고 용어 구분해서 쓰기
		} //0부터 9까지 추가	
		System.out.println(stack);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" "); //나온 값 조회, LIFO로 9부터 나옴
		}
	}
}
