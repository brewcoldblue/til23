package e7_2;

public class Movie {
	private int id = 0;
	private String title = "title";
	private String director = "director";
	private String genre = "genre";
	private int runningTime = 0;
	
	public Movie() {
	}
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		setId(id);
		setTitle(title);
		setDirector(director);
		setGenre(genre);
		setRunningTime(runningTime);
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

	@Override
	public String toString() {
		return "Movie [id=" + getId() + ", title=" + getTitle() + ", director=" + getDirector() + ", genre=" + getGenre() + ", runningTime="
				+ getRunningTime() + "]";
	}
	
	

}

