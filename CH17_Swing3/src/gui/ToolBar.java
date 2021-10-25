package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
		
	public ToolBar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ActionListener() {	// 익명클래스

			public void actionPerformed(ActionEvent e) {
				colorChanger.changeColor(Color.RED);	// 마우스 클릭시 실행
			}
			
		});
		
		// 람다식
		blueButton.addActionListener(e->colorChanger.changeColor(Color.BLUE));

					
		add(redButton);
		add(blueButton);
	}

}
