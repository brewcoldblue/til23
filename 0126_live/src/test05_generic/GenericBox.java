package test05_generic;

public class GenericBox<T> {
	// T는 타입처럼 사용할 수 있다
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	// 타입 파라미터가 있는 제네릭 메서드
	public <K> void genericMethod(K k) {
		//타입 파라미터를 메서드 내부에서 타입처럼 사용할 수 있다.
		//단 그 파라미터는 그 블록 안에서만 사용할 수 있다.
		System.out.println("T: " + data.getClass().getName());
		System.out.println("K: " + k.getClass().getName());
	}
}
