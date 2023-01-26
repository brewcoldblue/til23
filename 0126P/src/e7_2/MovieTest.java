package e7_2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		Movie M1 = new Movie(1, "도둑들", "모름", "액션", 100);
		SeriesMovie M2 = new SeriesMovie(1, "타짜", "모름", "액션", 110, 1, "타짜");
		SeriesMovie M3 = new SeriesMovie(1, "타짜2", "모름", "액션", 120, 2, "타짜");
		
		IMovieManagerImpl MM = IMovieManagerImpl.getIMovieManagerImpl(); //싱글턴 호출
		IMovieManagerImpl MM2 = IMovieManagerImpl.getIMovieManagerImpl(); //싱글턴 호출2
		MM.add(M1);
		MM.add(M2);
		MM.add(M3);
		

		System.out.println("모든 리스트\n"+Arrays.toString(MM.getList())+"\n=======");
		System.out.println("일반 영화\n"+Arrays.toString(MM.getMovies())+"\n=======");
		System.out.println("시리즈 영화\n"+Arrays.toString(MM.getSeriesMovies())+"\n=======");
		System.out.println("검색 결과\n"+Arrays.toString(MM.searchByTitle("짜"))+"\n=======");
		System.out.println(MM.getRunningTimeAvg());
		
		MM2.add(M1); //싱글턴 테스트
		System.out.println(MM.getIMovieManagerImpl() == MM2.getIMovieManagerImpl());
		
	}
}
