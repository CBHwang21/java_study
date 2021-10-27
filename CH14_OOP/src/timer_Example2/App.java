package timer_Example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("헬로우!");		
	}
	
}

public class App {
	public static void main(String[] args) {
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);	// 할일, 딜레이, 반복시간, 시간타입
	}

}
