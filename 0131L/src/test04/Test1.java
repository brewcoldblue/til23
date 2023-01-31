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
		// big_input.txt���� �� �پ� �о�ͼ�
		// ���������� �ٲٴ� �۾��� �غ���
		test1("   Scanner    ");
		test2("BufferedReader");
		
		/*
		 *       Scanner     -        27805600 ns. 
		 *    BufferedReader -         2235200 ns. 
		 *    ���۵尡... 10�� �̻� �����ϴ�...
		 */
	}
	public static void test1(String testname) throws IOException {
		try(Scanner sc = new Scanner(new FileInputStream("big_input.txt"))){
			//��ĳ�ʴ� ��Ʈ���� �ƴϴ�.
			long start = System.nanoTime();
			while(sc.hasNext()) {
				int num = sc.nextInt(); //nextInt�� �������� �ڵ����� ����ȯ��
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end - start);
		}
	}
	public static void test2(String testname) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("big_input.txt")))){
			//������ bufferedReader�� ���� ��Ȳ�� ǥ�������(System.im / System.out) ��Ȳ�̰�,
			//�̰� �ٷ� inputstream�� outputstream Ÿ������ �Ǿ� �ְ�, ����Ʈ ������ �����Ͱ� �Դٰ�����
			//Ű���忡�� �Է¹��� ����
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			//Scanner sc = new Scanner(System.in);
			//�̷��� ���µ�, ���� ����¿����� InputStreamReader�� �ʿ���� �� ����.
			long start = System.nanoTime();
			String l; //br�� line by line���� �о�´�
			while((l = br.readLine()) != null) {
				int num = Integer.parseInt(l); //br�� ����ȯ �����ִϱ� ������ �������.
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end - start);
		}
	}
}
