package anonymous_Class;

public class App {
	
	private String name = "펭수";

	public static void main(String[] args) {
		new App().start();
		
	}
	private void start() {
				
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	private void activate(Runnable runnable) {
		runnable.run();  // 추상메소드 run을 실행
	}
}
