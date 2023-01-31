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
			out.writeObject(new Person("홍승길", 20));
			System.out.println("파일에 객체를 출력했습니다.");
			
			in = new ObjectInputStream(new FileInputStream(new File("object.dat")));
			Object obj = in.readObject(); //오브젝트로 들고온다.
			Person p = (Person) obj; //가져온 오브젝트를 person으로 형변환
			System.out.println(p);
		} catch (Exception e) {
			System.out.println("try블록의 예외를 처리했어요.");
			e.printStackTrace();
		} finally { //try with resource가 아니어서 닫아줘야 함
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			} catch (Exception e) {
				System.out.println("중첩 try-catch문으로 finally 안의 예외를 처리했어요.");
			}
		}
	}
}
