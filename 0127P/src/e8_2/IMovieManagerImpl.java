package e8_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IMovieManagerImpl implements IMovieManager {

	private int MAX_SIZE = 100;
	private List<Movie> movieList = new ArrayList<>();
	private int size = 0;
	
	//싱글턴 패턴 만들기
	private static IMovieManagerImpl mm = new IMovieManagerImpl();
	private IMovieManagerImpl() {}
	public static IMovieManagerImpl getInstance() {
		return mm;
	}
	
	//인터페이스에서 implement하는 것이므로 추상메서드를 모두 오버라이드해야함
	@Override
	public void add(Movie movie) {
		if (movieList.size() < MAX_SIZE) {
			movieList.add(movie);
			size++;
		} else {
			System.out.println("100명까지만 등록할 수 있어요.");
		}
	}

	@Override
	public Movie[] getList() {
		Movie[] result = new Movie[movieList.size()];

			for(int i=0; i<result.length; i++) {
				result[i] = movieList.get(i);
			
		}
		return result;
	}

	@Override
	public Movie[] searchByTitle(String str) {
		int count = 0;

		for (int i = 0; i < this.size; i++) {
			if (movieList.get(i).getTitle().indexOf(str) != -1) {
				count++;
			}
		}

		if (count == 0)
			return null;

		Movie[] res = new Movie[count];
		
				for (int i = 0, idx = 0; i < this.size; i++) {
					if (movieList.get(i).getTitle().indexOf(str) != -1) {
						res[idx++] = movieList.get(i);
				}
			}		
		

		return res;
	}

	@Override
	public Movie[] getMovies() {
		
		int count = 0;
		
		for(int i=0; i<this.size; i++) {
			if(!(movieList.get(i) instanceof SeriesMovie)) {
				count++;
			}
		}
		
		if (count == 0)
			return null;
		
		Movie[] result = new Movie[count];
		
		for(int i=0, idx=0; i<this.size; i++) {
			if(!(movieList.get(i) instanceof SeriesMovie)) {
				result[idx++] = movieList.get(i);
			}
		}
		
		return result;
	}

	@Override
	public SeriesMovie[] getSeriesMovies() {
		
		int count = 0;
		
		for(int i=0; i<movieList.size(); i++) {
			if((movieList.get(i) instanceof SeriesMovie)) {
				count++;
			}
		}
		
		if (count == 0)
			return null;
		
		SeriesMovie[] result = new SeriesMovie[count];
		
		for(int i=0, idx=0; i<this.size; i++) {
			if((movieList.get(i) instanceof SeriesMovie)) {
				result[idx++] = (SeriesMovie) movieList.get(i);
			}
		}
		
		return result;
	}

	@Override
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<movieList.size(); i++) {
			sum += movieList.get(i).getRunningTime();
		}
		
		return sum/movieList.size();
	}

}
