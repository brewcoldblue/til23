package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
	//try ~ finally 사용해서, 데이터 정리
		try {
			in = new FileInputStream("newjeans.jpg");
			out = new FileOutputStream("newjeans-copy.jpg");
			
			int b; // byte -> int로 저장해도 됨 (묵시적 형 변환)
			while((b = in.read()) != -1) {
				//더이상 읽어올 데이터가 없으면 바이트가 -1을 리턴한다.
				//할당한 후 바로 비교
				out.write(b);
			}
			
			System.out.println("복사를 완료했습니다.");
		} finally {
			//입출력 스트림을 닫습니다.
			if(in != null) in.close();
			if(out != null) out.close();
			System.out.println("모든 리소스를 닫고 종료합니다.");
		}
	}
}
