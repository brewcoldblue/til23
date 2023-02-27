package test05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//바이트스트림으로 읽어서, 보조 스트림으로 그걸 문자로 바꿔서
		//버퍼드리더로 읽기
		//json 읽을 때는 문자 스트림 쓰기
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/refrigerator.json")));
		String str = null; //한 줄씩 읽어오기 위해 만든 빈 변수
		StringBuilder sb = new StringBuilder(); //한 줄씩 읽어온걸 이어붙여줌
		while ((str = br.readLine()) != null) {
			sb.append(str).append("\n");
		} //while을 빠져나오면 긴 문자열이 있을것.
		Gson gson = new Gson();
		Refrigerator[] arr = gson.fromJson(sb.toString(), Refrigerator[].class);
		//toString해서 문자열을 들고 옴
		List<Refrigerator> list = Arrays.asList(arr);
		System.out.println(list);
		
		//JSON 파일 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data/refrigerator-copy.json")));
		String str2 = gson.toJson(list);
		bw.write(str2);
		bw.close();
	}
}
