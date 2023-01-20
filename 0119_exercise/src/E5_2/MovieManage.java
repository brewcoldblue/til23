package e5_2;


public class MovieManage {
	int MAX_SIZE = 100;
	Mov[] array = new Mov[MAX_SIZE];

	int size;
	public Mov[] getArr() {
		return array;
	}
	public void setArr(Mov[] arr) {
		this.array = arr;
		this.size = arr.length;
	}
	public Mov searchByTitle(String str) {
		Mov result = new Mov();
		for(int i=0; i<array.length; i++) {
			if(array[i].getTitle().equals(str)) result = array[i];
		}
		System.out.println("검색 결과: "+result);
		return result;
	}
}
