package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);	// JFrame�� Ÿ��Ʋ�� ����
		
		setLayout(new BorderLayout());	// ����������â�� ������Ʈ�� ���̱� ����
		add(new ToolBar(), BorderLayout.NORTH);
		add(new MainPanel(), BorderLayout.CENTER);	// �߾� ��� �г��� ���̱�
		
		setSize(600, 400);		// â������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// â�� ������ ���α׷� ����
		setVisible(true);			// ���̰� �ϱ�
	}
	
}