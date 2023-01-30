package e9_2;

public class SeriesMovie extends Movie {
	private int seriesNum;
	private String episodes;
	
	private SeriesMovie() {
		super();
	}
	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episodes) {
		super(id, title, director, genre, runningTime);

		this.seriesNum=seriesNum;
		this.episodes=episodes;
	}
	public int getSeriesNum() {
		return seriesNum;
	}
	public void setSeriesNum(int i) {
		this.seriesNum = i;
	}
	public String getEpisodes() {
		return episodes;
	}
	public void setEpisodes(String s) {
		this.episodes = s;
	}
}