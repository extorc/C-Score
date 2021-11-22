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
		JPanel batsmenPanel = new JPanel();
		JPanel bowlerPanel = new JPanel();
		JPanel topBar = new JPanel();
		CButton newMatch = new CButton(0,0,100,25,"New Match");
		
		window.SetMaximized();
		panel.setLayout(null);
		batsmenPanel.setLayout(new BoxLayout(batsmenPanel, BoxLayout.Y_AXIS));
		bowlerPanel.setLayout(new BoxLayout(bowlerPanel, BoxLayout.Y_AXIS));
		int W = tk.getScreenSize().width, H = tk.getScreenSize().height;
		topBar.setLayout(new BoxLayout(topBar, BoxLayout.X_AXIS));
		topBar.setBounds(0, 0, W, 30);
		topBar.setBackground(new Color(210,210,210));
		batsmenPanel.setBounds(W/100, W/33, W * 5/10, H * 5/10);
		batsmenPanel.setBackground(new Color(200,200,200));
		bowlerPanel.setBounds(W/100 + W * 5/10 + 20, W/33, W * 5/10 - 50, H * 5/10);
		bowlerPanel.setBackground(new Color(200,200,200));
		
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
		panel.add(batsmenPanel);
		panel.add(bowlerPanel);
		window.add(panel);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
