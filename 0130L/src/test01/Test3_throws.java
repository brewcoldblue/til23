package test01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test3_throws {
	public static void main(String[] args) {
		method1("1234");
		
		try {
			method2("input.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage()+" :CheckedException");
		}
		//3. 이쪽으로 예외가 전달되어 빨간 줄이 여기로 온다.
		//4. 따라서 try-catch로 이걸 감싸거나, 아니면 main에서 throw하거나
	}
	public static void method1(String str) {
		int num = Integer.parseInt(str);
		//Unchecked Exception (NumberFormatException)
	}
	public static void method2(String filename) throws FileNotFoundException {
		//2. throws를 쓰면
		FileReader reader = new FileReader(filename);
		//반드시 처리해야만 하는 Checked Exception (FileNotFoundException)
		//1. 해결되지 않으면 빨간 줄이 나오고, 컴파일되지 않는다.
	}
}
