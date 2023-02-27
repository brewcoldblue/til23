package exercise;

public class E4_4_2 {
	int reviewId, resId;
	String writer, content;
	
	public String toString() {
		String result = "Review [reviewid="+reviewId+", resId="+resId+", writer="+writer+", content="+content+"]";
		return result;
	}
	
	public E4_4_2(int reviewId, int resId, String writer, String content) {
		this.reviewId=reviewId;
		this.resId=resId;
		this.writer=writer;
		this.content=content;
	}
}
