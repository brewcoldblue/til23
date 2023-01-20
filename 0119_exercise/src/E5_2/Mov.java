package e5_2;

public class Mov {
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runningTime;
	

	public Mov (int id, String title, String director, String genre, int runningTime) {
		setId(id);
		setTitle(title);
		setDirector(director);
		setGenre(genre);
		setRunningTime(runningTime);
	}
	
	public Mov () {
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

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	@Override
	public String toString() {
		return "Mov [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}
	
	
}
