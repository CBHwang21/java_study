package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로우!");
	}
}

class Task2 implements Runnable{
	@Override
	public void run() {
		System.out.println("하이!");		
	}	
}

public class App2 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert2(), 0, 1000);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS);
	}

}
