package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
	//try ~ finally ����ؼ�, ������ ����
		try {
			in = new FileInputStream("newjeans.jpg");
			out = new FileOutputStream("newjeans-copy.jpg");
			
			int b; // byte -> int�� �����ص� �� (������ �� ��ȯ)
			while((b = in.read()) != -1) {
				//���̻� �о�� �����Ͱ� ������ ����Ʈ�� -1�� �����Ѵ�.
				//�Ҵ��� �� �ٷ� ��
				out.write(b);
			}
			
			System.out.println("���縦 �Ϸ��߽��ϴ�.");
		} finally {
			//����� ��Ʈ���� �ݽ��ϴ�.
			if(in != null) in.close();
			if(out != null) out.close();
			System.out.println("��� ���ҽ��� �ݰ� �����մϴ�.");
		}
	}
}
