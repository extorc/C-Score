import UI.*;
import Utils.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Application implements ActionListener{

    public Application(){
        CWindow window = new CWindow("C-Score");
		window.setSize(300, 300);
		JPanel panel = new JPanel();
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		int W = tk.getScreenSize().width;

		JPanel topBar = new JPanel();
		CButton newMatch = new CButton(0,0,100,25,"New Match");
		
		panel.setLayout(null);
		topBar.setLayout(new BoxLayout(topBar, BoxLayout.X_AXIS));
		topBar.setBounds(0, 0, W, 30);
		topBar.setBackground(new Color(210,210,210));

		newMatch.addActionListener(e ->{
			if(e.getActionCommand().equals("New Match")){
				Match match = new Match(window);
				window.dispose();
				match.printData();
			}
		});
		
		topBar.add(newMatch);
		panel.add(topBar);
		window.add(panel);
		window.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
}