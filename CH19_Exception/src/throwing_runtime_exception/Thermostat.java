package throwing_runtime_exception;

public class Thermostat {

	public void setTemperature(double temperature) {
		
		setMachineTemperature(temperature);

		System.out.println("온도 세팅 : " + temperature);	// 온도가 정상일 경우 출력 
	}

	private void setMachineTemperature(double temperature) {
		
		if(temperature < 0 || temperature >35) {
			// 온도값이 비정상으로 여겨서 예외 처리한다. throw는 일단 예외를 나중에 처리(이 메소드를 호출할때 처리)
			throw new RuntimeException("온도가 비정상 입니다.");	  // 예외를 생성함
		}
		
	}
		
}
