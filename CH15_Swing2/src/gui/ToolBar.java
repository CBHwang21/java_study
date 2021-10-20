package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RedListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("빨간버튼 클릭!");
	}
	
}

class BlueListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("파란버튼 클릭!");
	}
	
}

public class ToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
		
	public ToolBar() {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new RedListener());
		blueButton.addActionListener(new BlueListener());
		
		add(redButton);
		add(blueButton);
	}

}
