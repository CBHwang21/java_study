package example;

@FunctionalInterface
interface Greeter {
	void greet();	// 추상메소드
}

public class App2 {
	
	public static void main(String[] args) {
		// 메소드 레퍼런스로 람다시 대체
		Greeter g = App2::sayHello;
		
		g.greet();
	}

	private static void sayHello() {
		System.out.println("헬로우~~");
	}
}
