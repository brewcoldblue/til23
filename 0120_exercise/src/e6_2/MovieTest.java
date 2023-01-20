package e6_2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		Movie M1 = new Movie(1, "도둑들", "모름", "액션", 100);
		SeriesMovie M2 = new SeriesMovie(1, "타짜", "모름", "액션", 110);
		SeriesMovie M3 = new SeriesMovie(1, "타짜2", "모름", "액션", 120);
		
		MovieManager MM = new MovieManager();
		MM.add(M1);
		MM.add(M2);
		MM.add(M3);
		
		System.out.println(Arrays.toString(MM.getList()));
		System.out.println(Arrays.toString(MM.getMovies()));
		System.out.println(Arrays.toString(MM.getSeriesMovies()));
		System.out.println(Arrays.toString(MM.searchByTitle("타")));
		System.out.println(MM.getRunningTimeAvg());
	}
}
