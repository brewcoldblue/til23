package e10_2;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IMovieManager {
	public abstract void add(Movie movie);
	public abstract Movie[] getList();
	public abstract Movie[] searchByTitle(String title) throws TitleNotFoundException;
	public abstract Movie[] getMovies();
	public abstract SeriesMovie[] getSeriesMovies();
	public abstract double getRunningTimeAvg();
	public abstract void saveData() throws FileNotFoundException, IOException;
}
