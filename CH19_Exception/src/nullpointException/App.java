package nullpointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null������, 0���� ���������� => ��Ÿ�� ���� �߻�
		// 1. 0���� ����������
		try {
		System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}
	}
	
	// 2. ��ü�� �ּҰ��� null�϶�!!!
	Scanner scanner = null;	//	new Scanner(System.in);
	
	try {
		sacnner.nextLine();
		scanner.close();
	} catch (nullpointException e) {
		System.out.println("��ü�� ���� null�Դϴ�.");
	}
	
	}
}
