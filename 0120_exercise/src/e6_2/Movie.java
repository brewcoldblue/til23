package e6_2;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runningTime;
	
	public Movie() {
	}
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		
	};
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String s) {
		this.title = s;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String s) {
		this.director = s;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String s) {
		this.genre = s;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int i) {
		this.runningTime = i;
	}

}

