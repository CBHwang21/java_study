package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class ColorListener implements ActionListener {

	private MainPanel mainPanel;
	private Color color;
	
	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);
	}
	
}

public class ToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
		
	public ToolBar(MainPanel mainPanel) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ColorListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorListener(mainPanel, Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}

}
