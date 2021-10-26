package throwing_runtime_exception;

public class Thermostat {

	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);

		System.out.println("�µ� ���� : " + temperature);	// �µ��� ������ ��� ��� 
	}

	private void setMachineTemperature(double temperature) {
		
		if(temperature < 0 || temperature >35) {
			// �µ����� ���������� ���ܼ� ���� ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��)
			throw new RuntimeException("�µ��� ������ �Դϴ�.");	  // ���ܸ� ������
		}
		
	}
		
}