package e5_2;

public class MovieManager {
	private final int MAX_SIZE = 100; //더 이상 고칠 수 없는 const
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	//싱글턴
	//1. private로 자기 자신의 인스턴스 만들기
	//2. 생성자를 막기
	//3. getter 만들기
	
	private static MovieManager instance = new MovieManager();
	private MovieManager() {
		
	}
	public MovieManager getInstance() {
		return instance;
	}
}
