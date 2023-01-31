package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws IOException {

		
		//try with resource
		//try ������ (), () �ȿ� �ʿ��� ���ҽ��� ����
		//�˾Ƽ� close����
			try (FileInputStream in = new FileInputStream("newjeans.jpg");
				 FileOutputStream out = new FileOutputStream("newjeans-copy3.jpg");){
				
				byte[]buffer = new byte[10];
				int read; //byte�� int������ ������
				while((read = in.read(buffer)) != -1) {
					//�Ź� in.read �� ������ 
					//���ۿ��ٰ� ���� �ϳ��� ����ִ´�
					//��������� read�� ������ ������ �Ǵ����� �����Ѵ�.
					//�� �̻� ���� ���� ������ -1.
					out.write(buffer, 0, read);
					System.out.println(Arrays.toString(buffer)+", "+read);
					//���۵鿡 ������ �ִ� ������ �ڹ��� Ư�� ������. ������ 0-255�� ���µ� �ڹٴ� -128-128�̶�...
				}
				System.out.println("���縦 �Ϸ��߽��ϴ�.");
				System.out.println("�˾Ƽ� ��Ʈ���� ������.");
			} 
		}
}
