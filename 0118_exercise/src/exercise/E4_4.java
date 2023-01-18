package exercise;

public class E4_4 {
	int resId, rate;
	String name, address, signatureMenu;
	public String toString() {
		String result = "Restaurant [resId="+resId+", name="+name+", address="+address+", signatureMenu="+signatureMenu+", rate="+rate+"]";
		return result;
	}
	
	public E4_4(int resid, String name, String address, String signatureMenu, int rate) {
		this.resId=resid;
		this.name=name;
		this.address=address;
		this.signatureMenu=signatureMenu;
		this.rate=rate;
	}
}
