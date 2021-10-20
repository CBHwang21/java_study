package multi_inheritance;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		//Speaker s1 = new Speaker();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
		//p2.greet(); 스피커 인터페이스에는 greet 메소드 없음!
		
		Greeter p3 = new Person();
		p3.greet();
		//p3.speak(); 그리터 인터페이스에는 speak 메소드 없음!
		
	}

}
