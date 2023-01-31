package test05;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		//File 클래스
		//파일도 되지만, 디렉토리의 객체도 생성이 가능하다.
		//이것저것 메소드를 쓸 수 있어서 편리.
		File f = new File("big_input.txt");
		System.out.println("이름: "+f.getName());
		System.out.println("경로: "+f.getPath());
		System.out.println("디렉토리인가?: "+f.isDirectory());
		System.out.println("파일인가?: "+f.isFile());
		System.out.println(f.toString());
		System.out.println(f);
	}
}
