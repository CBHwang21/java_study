package thisConstructor;

public class Person {
	private String name;	// 이름
	private int age;		// 나이
	
	public Person() {
		this("모름", 0);
		//name = "모름";
		//age = 0;
		
	}
	
	public Person(String name) {
		this(name, 0);
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}
