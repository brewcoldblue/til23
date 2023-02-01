package exercise;

public class E4_3_2 {
	public static void main(String[] args) {
		
		
		E4_3 book1 = new E4_3("00001", "TITLE1", "AUTHOR1", "PUBLISHER1", 10000, "DESC1");
		E4_3 book2 = new E4_3("00002", "TITLE2", "AUTHOR2", "PUBLISHER2", 20000, "DESC2");
		E4_3 book3 = new E4_3("00003", "TITLE3", "AUTHOR3", "PUBLISHER3", 30000, "DESC3");
		E4_3 book4 = new E4_3("00004", "TITLE4", "AUTHOR4", "PUBLISHER4", 40000, "DESC4");
		E4_3 book5 = new E4_3("00005", "TITLE5", "AUTHOR5", "PUBLISHER5", 50000, "DESC5");
		
		E4_3[] books = {book1, book2,book3, book4, book5};
		
		System.out.println("****************도서 목록****************");
		for (E4_3 book: books) {
			System.out.println(book.toString());
		}
	}
			
	
			
}
