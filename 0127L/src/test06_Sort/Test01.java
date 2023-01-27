package test06_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] arr = {"Samsung", "Software", "Academy", "For", "Youth"};
		List<String> list = Arrays.asList(arr); //배열을 고대로 리스트에 넣어줌
		System.out.println(list);
		
		//Collections 정렬할 때 (사전순 정렬)
		Collections.sort(list);
		System.out.println(list); //[Academy, For, Samsung, Software, Youth]
		
	}
}
