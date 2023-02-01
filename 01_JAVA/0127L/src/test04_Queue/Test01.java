package test04_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); //인터페이스니까 객체 생성 안됨, 링크드 리스트 사용
		for (int i=0; i<10; i++) {
			queue.offer(i); //값 추가
		}
		System.out.println(queue);
		while(!queue.isEmpty()) { //큐가 비어있지 않으면
			System.out.print(queue.poll()+" "); //들어간 순서대로 나온 값 출력, FIFO로 0부터 나옴
		}

		
	}
}
