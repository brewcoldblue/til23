package test07_equals;

public class Test {
	public static void main(String[] args) {
		
		//equals가 Student class에서 override되었을 때
		Student st = new Student("김기완", 333, "자바"); //f
		Student st2 = new Student("김기완", 30, "정치외교학"); //t
		
		System.out.println(st == st2); //f
		System.out.println(st.equals(st2)); //t
		
		Object o = new Object();
		o.equals(st);
		
		//원본 equals의 모습
//	    public boolean equals(Object obj) {
//	        return (this == obj);
//	    }
//		System.out.println(st == st2); //f
//		System.out.println(st.equals(st2)); //f
}
}