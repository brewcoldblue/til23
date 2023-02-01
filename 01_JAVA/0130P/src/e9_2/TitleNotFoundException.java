package e9_2;

public class TitleNotFoundException extends Exception {
	private String title;
	public TitleNotFoundException(String title) {
		super("에러: "+title+"에 해당하는 영화가 없어요.");
		System.out.println("에러: "+title+"에 해당하는 영화가 없어요.");
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
}
