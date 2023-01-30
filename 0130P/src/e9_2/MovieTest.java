package e9_2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		Movie M1 = new Movie(1, "도둑들", "모름", "액션", 100);
		SeriesMovie M2 = new SeriesMovie(1, "타짜", "모름", "액션", 110, 1, "타짜");
		SeriesMovie M3 = new SeriesMovie(1, "타짜2", "모름", "액션", 120, 2, "타짜");
		
		IMovieManagerImpl MM = IMovieManagerImpl.getIMovieManagerImpl();
		MM.add(M1);
		MM.add(M2);
		MM.add(M3);
		

		try {
			MM.searchByTitle("뿅");
		} catch (TitleNotFoundException e) {
			e.getMessage();
		}

	}
}
