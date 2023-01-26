package test07_wildcard;

public class Test {
	public static void main(String[] args) {
		
		GenericBox<Student> studentBox = new GenericBox<>();
		GenericBox<Person> personBox = new GenericBox<>();
		GenericBox<Object> objectBox = new GenericBox<>();
	
		GenericBox<?> allBox = objectBox;
		allBox = personBox;
		allBox = studentBox;
		
		GenericBox<? extends Person> pAndC = personBox;
		pAndC = studentBox;
//		pAndC = objectBox; //err
		
		GenericBox<? super Person> pOnly = personBox;
//		pOnly = studentBox; //err
		pOnly = objectBox; //ok
	}
}
