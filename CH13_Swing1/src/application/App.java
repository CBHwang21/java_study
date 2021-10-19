package application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// JFrame으로 윈도우 창 만들기
		
		SwingUtilities.invokeLater(()->{
			
			new MainFrame("테스트 스윙");	// 새창 mainFrame을 생성
				
		});
		
	}

}
