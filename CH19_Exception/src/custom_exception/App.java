package custom_exception;

import custom_exception.exception.TempOutOfRangeException;
import custom_exception.exception.TempTooHighException;
import custom_exception.exception.TempTooLowException;

public class App {
	public static void main(String[] args)  {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		// setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�.
		// try-catch�� �ٷ� ó��, throw�� �ѱ�
		
		try {
			stat.setTemperature(-5);
		} catch (TempTooHighException e) {
			// �µ��� ������� ó�� �ڵ�
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// �µ��� ������� ó�� �ڵ�
			System.out.println(e.getMessage());
		}
	}

}
