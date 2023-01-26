package test05_generic;

public class Test {
	public static void main(String[] args) {
		NormalBox b = new NormalBox();
		b.setData("Hello World!");
		b.getData();
		
//		GenericBox<String> strBox = new GenericBox<String>(); //String으로만 된 박스
//		strBox.setData("wow");
//		System.out.println(strBox.getData());
//		
//		GenericBox<Integer> intBox = new GenericBox<>();
//		intBox.setData(1234);
//		
//		Integer i = intBox.getData();
//		System.out.println(i);
		
		GenericBox<Integer> intbox = new GenericBox<>();
		intbox.setData(12345);
		System.out.println(intbox.getData());
		intbox.genericMethod("STRING");
		

	}
}
