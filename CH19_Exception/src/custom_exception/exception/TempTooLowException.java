package custom_exception.exception;

// �µ��� �ʹ� ���� ��� �߻���ų ����
public class TempTooLowException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;
	
	public TempTooLowException(String message) {
		// ������ ���� �޽����� ���� ����Ŭ������ ó��
		super(message);	// ����Ŭ�������� �޽��������� ���ܸ� ����
	}

}