package test02_Char_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//character stream -> reader/writer
		try (FileReader reader = new FileReader("big_input.txt");
			 FileWriter writer = new FileWriter("big_input-copy.txt")){
			int c;
			while((c = reader.read()) != -1 ) {
				writer.write(c);
			}
			System.out.println("복사 완료");
			System.out.println("try with resource라서 알아서 close됨");
		}
	}
}
