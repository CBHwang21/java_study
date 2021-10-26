package gui;

import java.awt.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	
	public MainFrame() {
		super("Game Of Life");	// 타이틀명
		
		setLayout(new BorderLayout());	// 레이아웃 구역설정
		add(gamePanel, BorderLayout.CENTER);	// 게임 패널을 가운데
				
		setSize(800, 600);		// 창사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창을 닫을때 프로그램 종료
		setVisible(true);			// 보이게 하기
	}
}
