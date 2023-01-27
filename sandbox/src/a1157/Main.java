package a1157;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.toUpperCase().split("");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else map.put(arr[i], 1);
		}
		Iterator<String> e = map.keySet().iterator();

		String answer = null;
		int memo = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > memo) {
				answer = key;
				memo = map.get(key);
			}
			else if (map.get(key) == memo) {
				answer = "?";
			}
			else continue;
		}
		
		System.out.println(answer);
		
	}
}