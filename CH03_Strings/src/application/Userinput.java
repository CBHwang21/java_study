package application;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ���� scanner �̿�
		Scanner scanner = new Scanner(System.in);	// ��ĳ�ʸ� ����� �� �ְ� ����
		System.out.println("�µ��� �Է��� �ּ��� : ");
		double c = scanner.nextDouble();	// ��ĳ�� ��ü�� nextINT() �޼ҵ�� �������� �Է�
		double f = (c * 9/5) + 32;	// ȭ��
		scanner.close();
		
		System.out.println("���� "+c+"�� ȭ�� "+f+"�̴�.");

	}

}
