package e5_2;

public class MovieTest {
	public static void main(String[] args) {
		Mov MV1 = new Mov(0, "아바타", "제임스 카메론", "판타지", 162);
		Mov MV2 = new Mov(1, "아바타2", "제임스 카메론", "판타지", 192);
		MovieManage MM = new MovieManage();
		Mov[] movies = {MV1, MV2};
		System.out.println(MV1.toString());
		System.out.println(MV2.toString());
		MM.setArr(movies);
		MM.searchByTitle("아바타");
	}
}
