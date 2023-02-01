package exercise;

public class E4_3 {
	String isbn, title, author, publisher, desc;
	int price;

	public String toString() {
		String result = isbn +"   | " + title+"   | " + author+"   | " + publisher+"   | " + price+"   | " + desc;
		return result;
	}
	
	public E4_3(String isbn, String title, String author, String publisher, int price,  String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
}
