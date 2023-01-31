package test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		// BufferedReader & BufferedWriter,
		// FileReader & FileWriter 속도 테스트
		test1("    FileReader & FileWriter    ");
		test2("BufferedReader & BufferedWriter");
		
		/*
		 *
		 *         FileReader & FileWriter     -        32509500 ns. 
		 *     BufferedReader & BufferedWriter -         3470800 ns. 
		 *     보통 약 8-10배 정도의 속도 차이가 있음. 버퍼가 훨씬 빠르다.
		 */
	}
	public static void test1(String testname) throws IOException {
		try(FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input-copy2.txt")){
			long start = System.nanoTime();
			int c;
			while((c = reader.read()) != -1 ) {
				writer.write(c); //문자열 하나씩 읽어와서 하나씩 쓰는
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}
	
	//보조스트림을 사용한 경우
	public static void test2(String testname) throws IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("big_input.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("big_input-copy3.txt"))){
			long start = System.nanoTime();
			//BufferedReader, writer는 문자열을 하나씩 읽어오는게 아니라,
			//실제로는 라인 단위로 읽어온다.
			String line;
			while((line = reader.readLine()) != null ) {
				writer.write(line); //문자열을 문장 단위로 읽어와서 쓰는
				writer.newLine(); //줄바꿈
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}
}
