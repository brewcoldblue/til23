package exercise;

public class E4_4_3 {
	public static void main(String[] args) {
		E4_4 r1 = new E4_4(101, "을밀대", "서울", "양지탕밥", 4);
		E4_4 r2 = new E4_4(102, "을지면옥", "서울", "수육", 4);
		E4_4 r3 = new E4_4(103, "우래옥", "서울", "불고기", 4);
		E4_4 r4 = new E4_4(104, "필동면옥", "서울", "만두", 4);
		
		E4_4_2 re1 = new E4_4_2(1, 101, "김싸피", "하 3월 전에 한번 가야됨");
		E4_4_2 re2 = new E4_4_2(2, 102, "싸피김", "냉면도 맛있어요");
		E4_4_2 re3 = new E4_4_2(3, 103, "박싸피", "근데 불고기 못 사먹음");
		E4_4_2 re4 = new E4_4_2(4, 104, "싸피박", "만두만두");
		
		System.out.println("****************맛집목록****************");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		
		System.out.println("****************리뷰목록****************");
		System.out.println(re1.toString());
		System.out.println(re2.toString());
		System.out.println(re3.toString());
		System.out.println(re4.toString());
	}
}
