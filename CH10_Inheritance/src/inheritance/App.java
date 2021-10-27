package inheritance;

public class App {

	public static void main(String[] args) {
		// 새는 동물을 상속받음
		Animal ani1 = new Animal();
		ani1.eat();
		
		Bird bird1 = new Bird();
		bird1.eat();	// 상속받은 동물의 메소드
		bird1.fly();

	}

}
