package e6_2;

import java.util.Arrays;

import h6_2.User;
import h6_2.VipUser;

public class MovieManager {
	private int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	
	Movie init = new Movie();
	
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size] = movie;
			size++;
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}

	public Movie[] getList() {
		return movieList;
	}

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
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(!(movieList[i] instanceof SeriesMovie)) {
				result[idx++] = movieList[i];
			}
		}
		
		return result;
	}
	public Movie[] getSeriesMovies() {
	int count = 0;
		
		for(int i=0; i<this.size; i++) {
			if((movieList[i] instanceof SeriesMovie)) {
				count++;
			}
		}
		
		if (count == 0)
			return null;
		
		Movie[] result = new Movie[count];
		
		for(int i=0, idx=0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if((movieList[i] instanceof SeriesMovie)) {
				result[idx++] = movieList[i];
			}
		}
		
		return result;
	}
	public Movie[] searchByTitle(String str) {
		int count = 0;

		for (int i = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (movieList[i].getTitle().indexOf(str) != -1) {
				count++;
			}
		}

		if (count == 0)
			return null;

		Movie[] res = new Movie[count];

		for (int i = 0, idx = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (movieList[i].getTitle().indexOf(str) != -1) {
				res[idx++] = movieList[i];
			}
		}

		return res;
	}
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		
		return sum/this.size;
		
	}
}
