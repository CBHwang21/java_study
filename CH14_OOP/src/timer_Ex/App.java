package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import timer_Ex.Task;

class Alert extends Runnable{
	@Override
	public void run() {
		System.out.println("��� ��� ��");		
	}
	
}

class Task implements TimerTask {
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "��� ��� �Ϸ�");

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 5000, 5000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 30, 30, TimeUnit.SECONDS);
		
		
	}

}
