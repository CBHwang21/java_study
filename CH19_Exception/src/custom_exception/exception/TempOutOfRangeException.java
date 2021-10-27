package custom_exception.exception;

// 온도가 낮거나 또는 너무 높을경우 발생하는 예외의 상위 클래스
public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {
		// 생성자 예외 메시지를 상위 예외클래스에 처리
		super(message);	// 예외클래스에서 메시지명으로 예외를 생성
	}

}
