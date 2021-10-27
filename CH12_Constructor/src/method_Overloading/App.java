package method_Overloading;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.greet();
		person.greet("펭수");
		person.greet(190);
		person.greet("라이언", 170);
		
	}

}
