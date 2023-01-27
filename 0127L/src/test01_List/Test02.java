package test01_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test02 {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();
		List<Object> ll = new LinkedList<>();
		List<Object> vec = new Vector<>();
		
		test1("순차적 추가 - ArrayList  - ", al);
		test1("순차적 추가 - LinkedList - ", ll);
		test1("순차적 추가 - Vector     - ", vec);
		
		test2("중간에 추가 - ArrayList  - ", al);
		test2("중간에 추가 - LinkedList - ", ll);
		test2("중간에 추가 - Vector     - ", vec);
		
		test3("데이터 조회 - ArrayList  - ", al);
		test3("데이터 조회 - LinkedList - ", ll);
		test3("데이터 조회 - Vector     - ", vec);
		
	}
	
	public static void test1 (String testname, List<Object> list) {
		long start = System.nanoTime(); //현재시간 불러오기
		for (int i=0; i<50000; i++) { //5만번 반복할 때 얼마나 시간이 걸리는지
			list.add(new String("HELLO")); // 리스트 맨 뒤에 추가
		}
		long end = System.nanoTime(); //끝
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}
	
	public static void test2 (String testname, List<Object> list) {
		long start = System.nanoTime(); //현재시간 불러오기
		for (int i=0; i<50000; i++) { //5만번 반복할 때 얼마나 시간이 걸리는지
			list.add(0, new String("HELLO")); //리스트 맨 앞이나 중간에 추가
		}
		long end = System.nanoTime(); //끝
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}
	
	public static void test3 (String testname, List<Object> list) {
		long start = System.nanoTime(); //현재시간 불러오기
		for (int i=0; i<list.size(); i++) { //5만번 반복할 때 얼마나 시간이 걸리는지
			list.get(i); //리스트에 있는 모든 원소 조회
		}
		long end = System.nanoTime(); //끝
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}
}
