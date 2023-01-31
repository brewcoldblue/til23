package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws IOException {

		
		//try with resource
		//try 다음에 (), () 안에 필요한 리소스를 정의
		//알아서 close해줌
			try (FileInputStream in = new FileInputStream("newjeans.jpg");
				 FileOutputStream out = new FileOutputStream("newjeans-copy3.jpg");){
				
				byte[]buffer = new byte[10];
				int read; //byte를 int형으로 저장함
				while((read = in.read(buffer)) != -1) {
					//매번 in.read 할 때마다 
					//버퍼에다가 값을 하나씩 집어넣는다
					//결과적으로 read는 어디까지 읽으면 되는지를 저장한다.
					//더 이상 읽을 것이 없으면 -1.
					out.write(buffer, 0, read);
					System.out.println(Arrays.toString(buffer)+", "+read);
					//버퍼들에 음수가 있는 이유는 자바의 특성 때문임. 원래는 0-255를 쓰는데 자바는 -128-128이라서...
				}
				System.out.println("복사를 완료했습니다.");
				System.out.println("알아서 스트림이 닫혀요.");
			} 
		}
}
