package test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws IOException {
		// Scanner vs. BufferedReader
		// big_input.txt에서 한 줄씩 읽어와서
		// 정수형으로 바꾸는 작업을 해보기
		test1("   Scanner    ");
		test2("BufferedReader");
		
		/*
		 *       Scanner     -        27805600 ns. 
		 *    BufferedReader -         2235200 ns. 
		 *    버퍼드가... 10배 이상 빠릅니다...
		 */
	}
	public static void test1(String testname) throws IOException {
		try(Scanner sc = new Scanner(new FileInputStream("big_input.txt"))){
			//스캐너는 스트림은 아니다.
			long start = System.nanoTime();
			while(sc.hasNext()) {
				int num = sc.nextInt(); //nextInt로 가져오면 자동으로 형변환됨
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end - start);
		}
	}
	public static void test2(String testname) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("big_input.txt")))){
			//보통은 bufferedReader을 쓰는 상황은 표준입출력(System.im / System.out) 상황이고,
			//이게 바로 inputstream과 outputstream 타입으로 되어 있고, 바이트 단위로 데이터가 왔다갔다함
			//키보드에서 입력받을 때는
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			//Scanner sc = new Scanner(System.in);
			//이렇게 쓰는데, 파일 입출력에서는 InputStreamReader이 필요없을 수 있음.
			long start = System.nanoTime();
			String l; //br은 line by line으로 읽어온다
			while((l = br.readLine()) != null) {
				int num = Integer.parseInt(l); //br은 형변환 안해주니까 강제로 해줘야함.
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end - start);
		}
	}
}
