package interface_inheritance;

// 인터페이스에 인터페이스를 상속
public interface DefaultRunnable extends Runnable {
	default void displayDetails() {	// 디폴트 메서드는 메소드 코드를 만든다.
		System.out.println("표시할 디테일 없음");
	};
}
