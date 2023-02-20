package test02;

public class Test1_bruteforce {
	public static void main(String[] args) {
		char[] t = "This iss a book".toCharArray();
		char[] p = "iss".toCharArray();
		int idx = BruteForceFor(p, t);
	}

	private static int BruteForceFor(char[] p, char[] t) {
		int n = t.length;
		int m = p.length;
		
		for(int i=0; i<n-m+1; i++) { //패턴이 한 칸씩 shift하는데, 최대 n-m+1번 이동함
			boolean flag = true;
			
			for(int j=0; j<m; j++) { //각 shift에서 1:1비교가 최대 m번 수행됨
				if(p[j] != t[i+j]) {
					flag = false; //일치 안 하면
					break; //나와
				}
			}
			if(flag) return i; //일치하면 일치 시작점 리턴
		}
		return -1; //끝까지 flag가 false면 -1 리턴
	}
	
	private static int BruteForceWhile(char[] p, char[] t) {
		int i=0;
		int j=0;
		
		while(j<p.length && i<t.length) {
			if(t[i] != p[j]) { //문자열의 i번째와 패턴의 j번째가 일치하지 않으면
				i = i - j; //i에는 i-j를 할당,
				//문자열 인덱스에서 패턴이 불일치하는 부분을 빼면 다시 시작점으로 돌아간다.
				j = -1; //j에는 -1을 할당
			}
			//while문의 특징 - 인덱스 증가 부분이 따로 있음
			//여기서 패턴 비교를 위해서는 i와 j를 동시에 증가시켜서 패턴과 문자열의 일부분이 일치하는지 비교해야 함
			//패턴 비교에서 불일치가 나온 경우에도 여기서 i와 j를 동시에 증가시켜서 패턴을 한 칸 이동시키는 것
			i = i+1;
			j = j+1;
		}
		if(j == p.length) return i - p.length;
		else return -1;
	}
}
