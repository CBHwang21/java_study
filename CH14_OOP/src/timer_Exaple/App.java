package timer_Exaple;

import java.util.Timer;
import java.util.TimerTask;
// �ϳ��� ���Ͽ� �������� Ŭ������ ����� �ִ�. �׷��� public class�� �� �ϳ��̰� ������ �̸��� ����.
class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("��ο�");
	}
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 100);	// ����:run(), 0�ʵ� ����, �ݺ� 1��(1/1000�����̱� ������ 1��)
	}
}
