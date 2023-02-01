package e7_2;


public class IMovieManagerImpl implements IMovieManager {

	private int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	
	//싱글턴 패턴 만들기
	private static IMovieManagerImpl mm = new IMovieManagerImpl();
	private IMovieManagerImpl() {}
	public static IMovieManagerImpl getIMovieManagerImpl() {
		return mm;
	}
	
	//인터페이스에서 implement하는 것이므로 추상메서드를 모두 오버라이드해야함
	@Override
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size] = movie;
			size++;
		} else {
			System.out.println("100명까지만 등록할 수 있어요.");
		}
	}

	@Override
	public Movie[] getList() {
		return movieList;
	}

	@Override
	public Movie[] searchByTitle(String str) {
		int count = 0;

		for (int i = 0; i < this.size; i++) {
			if (movieList[i].getTitle().indexOf(str) != -1) {
				count++;
			}
		}

		if (count == 0)
			return null;

		Movie[] res = new Movie[count];

		for (int i = 0, idx = 0; i < this.size; i++) {
			if (movieList[i].getTitle().indexOf(str) != -1) {
				res[idx++] = movieList[i];
			}
		}

		return res;
	}

	@Override
	public Movie[] getMovies() {
		
		int count = 0;
		
		for(int i=0; i<this.size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)) {
				count++;
			}
		}
		
		if (count == 0)
			return null;
		
		Movie[] result = new Movie[count];
		
		for(int i=0, idx=0; i<this.size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)) {
				result[idx++] = movieList[i];
			}
		}
		
		return result;
	}

	@Override
	public SeriesMovie[] getSeriesMovies() {
		
		int count = 0;
		
		for(int i=0; i<this.size; i++) {
			if((movieList[i] instanceof SeriesMovie)) {
				count++;
			}
		}
		
		if (count == 0)
			return null;
		
		SeriesMovie[] result = new SeriesMovie[count];
		
		for(int i=0, idx=0; i<this.size; i++) {
			if((movieList[i] instanceof SeriesMovie)) {
				result[idx++] = (SeriesMovie) movieList[i];
			}
		}
		
		return result;
	}

	@Override
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		
		return sum/this.size;
	}

}
