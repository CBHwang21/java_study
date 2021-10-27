package gui;

import java.awt.Color;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ColorChangeListener{

	private static final long serialVersionUID = 1L;

	public MainPanel() {
		setBackground(Color.GREEN);
	}

	@Override
	public void changeColor(Color color) {
		setBackground(color);	// 배경색 바꾸기 추상메소드 changeColor 완성
	}
}
