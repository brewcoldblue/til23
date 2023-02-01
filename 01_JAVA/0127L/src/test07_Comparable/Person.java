package test07_Comparable;

//Collections.sort()를 사용하고 싶으면 해당 클래스가 Comparable 인터페이스를 구현해야 함
public class Person implements Comparable<Person>{
	private String name;
	private String id;
	
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return this.id.equals(other.id);
		} else return false;
	}

	@Override
	public int compareTo(Person o) {
		//이름 순으로 정렬: String의 compareTo를 그대로 사용한 것임
//		return this.name.compareTo(o.name);
		
		//나이 순으로 정렬: Integer의 compareTo를 그대로 사용한 것임
		return Integer.parseInt(this.id) - Integer.parseInt(o.id);
	}
}
