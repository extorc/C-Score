package UI;

import javax.swing.JButton;

public class CButton extends JButton{
	public CButton(int x, int y, int width, int height, String text) {
		setText(text);
		setBounds(x, y, width, height);
	}
}
