package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {

		
	//try with resource
	//try 다음에 (), () 안에 필요한 리소스를 정의
	//알아서 close해줌
		try (FileInputStream in = new FileInputStream("newjeans.jpg");
			 FileOutputStream out = new FileOutputStream("newjeans-copy2.jpg");){
			
			int b; // byte -> int로 저장해도 됨 (묵시적 형 변환)
			while((b = in.read()) != -1) {
				//더이상 읽어올 데이터가 없으면 바이트가 -1을 리턴한다.
				//할당한 후 바로 비교
				out.write(b);
			}
			System.out.println("복사를 완료했습니다.");
			System.out.println("알아서 스트림이 닫혀요.");
		} 
	}
}
