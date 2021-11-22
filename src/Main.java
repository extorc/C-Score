import UI.*;
import Utils.*;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Main implements ActionListener{
	public static void main(String[] args) {
		CWindow window = new CWindow("C-Score");
		Toolkit tk = Toolkit.getDefaultToolkit();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JPanel topBar = new JPanel();
		CButton newMatch = new CButton(0,0,100,25,"New Match");

		window.SetMaximized();
		topBar.setLayout(new BoxLayout(topBar, BoxLayout.X_AXIS));
		topBar.setBounds(0, 0, tk.getScreenSize().width, 30);
		topBar.setBackground(new Color(200,200,200));
		
		newMatch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getActionCommand() == "New Match"){
					Match match = MatchSettings.LoadMatchSettings(window);
					match.printData();
					match = TeamSettings.LoadTeamSettings(window, match, 0);
					match = TeamSettings.LoadTeamSettings(window, match, 1);
				}
			}
		});

		topBar.add(newMatch);
		panel.add(topBar);
		window.add(panel);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
