package test05;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		//File Ŭ����
		//���ϵ� ������, ���丮�� ��ü�� ������ �����ϴ�.
		//�̰����� �޼ҵ带 �� �� �־ ��.
		File f = new File("big_input.txt");
		System.out.println("�̸�: "+f.getName());
		System.out.println("���: "+f.getPath());
		System.out.println("���丮�ΰ�?: "+f.isDirectory());
		System.out.println("�����ΰ�?: "+f.isFile());
		System.out.println(f.toString());
		System.out.println(f);
	}
}
