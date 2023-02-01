package e5_2;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String genre;
	private String runningTime;
	
	
	public String toString() {
		return "movie [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}

	public Movie(int id, String title, String director, String genre, String runningTime) {
		setId(id);
		setTitle(title);
		setDirector(director);
		setGenre(genre);
		setRunningTime(runningTime);
	}
	
}
