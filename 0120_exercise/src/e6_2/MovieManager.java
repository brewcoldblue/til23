package e6_2;

public class MovieManager {
	private int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	SeriesMovie[] seriesMovieList = new SeriesMovie[MAX_SIZE];
	public void add(Movie movie) {
		movieList[size] = movie;
		size++;
	}
	public Movie[] getList() {
		return movieList;
	}
	public Movie[] searchByTitle(String str) {
		Movie[] result = new Movie[MAX_SIZE];
		int resultsize = 0;
		for (Movie M: movieList) {
			if (M.getTitle().indexOf(str) != -1) result[resultsize] = M;
			resultsize++;
		}
		return result;
	}
	public Movie[] getMovies() {
		Movie[] result = new Movie[MAX_SIZE];
		int resultsize = 0;
		for (Movie M: movieList) {
			if (M instanceof Movie) result[resultsize] = M;
			resultsize++;
		}
		return result;
	}
	public SeriesMovie[] getSeriesMovies() {
		SeriesMovie[] result = new SeriesMovie[MAX_SIZE];
		int resultsize = 0;
		for (Movie M: movieList) {
			if (M instanceof SeriesMovie) result[resultsize] = (SeriesMovie) M;
			resultsize++;
		}
		return result;
	}
	public double getRunningTimeAvg() {
		double sum = 0;
		for (Movie M: movieList) {
			sum += M.getRunningTime();
		}
		double result = sum/size;
		return result;
	}
}
