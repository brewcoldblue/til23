package e6_2;

public class SeriesMovie extends Movie {
	private int seriesNum;
	private String episodes;
	
	public SeriesMovie() {
		
	}
	public SeriesMovie(int id, String title, String director, String genre, int runningTime) {
		
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