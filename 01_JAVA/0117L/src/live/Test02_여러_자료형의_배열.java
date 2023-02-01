package live;

public class Test02_여러_자료형의_배열 {
	public static void main(String[] args) {
		boolean[] bArr = new boolean[3];
		char[] cArr = new char[3];
		float[] fArr = new float[2];
		double[] dArr = new double[5];
		String[] sArr = new String[3];
		
		System.out.println(bArr[0]); //false
		System.out.println(cArr[0]); //"\u0000"
		System.out.println(fArr[0]); //0.0f
		System.out.println(dArr[0]); //0.0
		System.out.println(sArr[0]); //null
		System.out.println(bArr); //주소값
		
	}
}
