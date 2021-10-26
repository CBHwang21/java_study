package custom_exception;

import custom_exception.exception.TempOutOfRangeException;
import custom_exception.exception.TempTooHighException;
import custom_exception.exception.TempTooLowException;

public class Thermostat {

	public void setTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		
		setMachineTemperature(temperature);

		System.out.println("�µ� ���� : " + temperature);	// �µ��� ������ ��� ��� 
	}

	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		
		if(temperature < 0) { 
			throw new TempTooLowException("�µ��� �ʹ� �����ϴ�.");	  // ���ܸ� ������
		}
	else if(temperature > 35) {
		throw new TempTooHighException("�µ��� �ʹ� �����ϴ�"); // ���ܸ� ������
		}
	}
		
}
