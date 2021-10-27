package custom_exception;

import custom_exception.exception.TempOutOfRangeException;
import custom_exception.exception.TempTooHighException;
import custom_exception.exception.TempTooLowException;

public class App {
	public static void main(String[] args)  {
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		// setTemperature 메소드에서 예외처리를 throw했기 때문에 호출할때 처리해야 한다.
		// try-catch는 바로 처리, throw는 넘김
		
		try {
			stat.setTemperature(-5);
		} catch (TempTooHighException e) {
			// 온도가 낮을경우 처리 코드
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// 온도가 높을경우 처리 코드
			System.out.println(e.getMessage());
		}
	}

}
