package timer_Exaple;

import java.util.Timer;
import java.util.TimerTask;
// 하나의 파일에 여러개의 클래스를 만들수 있다. 그런데 public class는 단 하나이고 파일의 이름과 같다.
class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 100);	// 할일:run(), 0초뒤 실행, 반복 1초(1/1000단위이기 때문에 1초)
	}
}
