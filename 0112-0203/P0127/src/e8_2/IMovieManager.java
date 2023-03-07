package e8_2;

public interface IMovieManager {
	public abstract void add(Movie movie);
	public abstract Movie[] getList();
	public abstract Movie[] searchByTitle(String title);
	public abstract Movie[] getMovies();
	public abstract SeriesMovie[] getSeriesMovies();
	public abstract double getRunningTimeAvg();
}
