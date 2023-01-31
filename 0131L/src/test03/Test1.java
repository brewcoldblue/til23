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
		// FileReader & FileWriter �ӵ� �׽�Ʈ
		test1("    FileReader & FileWriter    ");
		test2("BufferedReader & BufferedWriter");
		
		/*
		 *
		 *         FileReader & FileWriter     -        32509500 ns. 
		 *     BufferedReader & BufferedWriter -         3470800 ns. 
		 *     ���� �� 8-10�� ������ �ӵ� ���̰� ����. ���۰� �ξ� ������.
		 */
	}
	public static void test1(String testname) throws IOException {
		try(FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input-copy2.txt")){
			long start = System.nanoTime();
			int c;
			while((c = reader.read()) != -1 ) {
				writer.write(c); //���ڿ� �ϳ��� �о�ͼ� �ϳ��� ����
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}
	
	//������Ʈ���� ����� ���
	public static void test2(String testname) throws IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader("big_input.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("big_input-copy3.txt"))){
			long start = System.nanoTime();
			//BufferedReader, writer�� ���ڿ��� �ϳ��� �о���°� �ƴ϶�,
			//�����δ� ���� ������ �о�´�.
			String line;
			while((line = reader.readLine()) != null ) {
				writer.write(line); //���ڿ��� ���� ������ �о�ͼ� ����
				writer.newLine(); //�ٹٲ�
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}
}
