package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {

		
	//try with resource
	//try ������ (), () �ȿ� �ʿ��� ���ҽ��� ����
	//�˾Ƽ� close����
		try (FileInputStream in = new FileInputStream("newjeans.jpg");
			 FileOutputStream out = new FileOutputStream("newjeans-copy2.jpg");){
			
			int b; // byte -> int�� �����ص� �� (������ �� ��ȯ)
			while((b = in.read()) != -1) {
				//���̻� �о�� �����Ͱ� ������ ����Ʈ�� -1�� �����Ѵ�.
				//�Ҵ��� �� �ٷ� ��
				out.write(b);
			}
			System.out.println("���縦 �Ϸ��߽��ϴ�.");
			System.out.println("�˾Ƽ� ��Ʈ���� ������.");
		} 
	}
}
