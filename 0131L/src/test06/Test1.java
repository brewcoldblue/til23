package test06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(new File("object.dat")));
			out.writeObject(new Person("ȫ�±�", 20));
			System.out.println("���Ͽ� ��ü�� ����߽��ϴ�.");
			
			in = new ObjectInputStream(new FileInputStream(new File("object.dat")));
			Object obj = in.readObject(); //������Ʈ�� ���´�.
			Person p = (Person) obj; //������ ������Ʈ�� person���� ����ȯ
			System.out.println(p);
		} catch (Exception e) {
			System.out.println("try����� ���ܸ� ó���߾��.");
			e.printStackTrace();
		} finally { //try with resource�� �ƴϾ �ݾ���� ��
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			} catch (Exception e) {
				System.out.println("��ø try-catch������ finally ���� ���ܸ� ó���߾��.");
			}
		}
	}
}
