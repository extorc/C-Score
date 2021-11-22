package UI;

import javax.swing.JFrame;

public class CWindow extends JFrame{
	public CWindow(String title) {
		setTitle(title);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void SetMaximized(){
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
}
